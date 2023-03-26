package fr.paralax.server.route.story;

import fr.paralax.server.ServerApplication;
import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UpdateInformation {

    @PostMapping("/click/{button_id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("button_id") String button, HttpSession session) {
        final Map<String, String> content = new HashMap<>();
        final String token = (String) session.getAttribute("story_token");
        if (token == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(content);
        Story story = null;
        for (Story tmp : ServerApplication.getInstance.storyGStorage.getEntityList()) {
            if (tmp.getFileID().equalsIgnoreCase(token)) {
                story = tmp;
                break;
            }
        }
        if (story == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(content);

        if (!button.equalsIgnoreCase("update_local")) {
            TileFrame.ButtonState redirect = story.getTile().onClickOnButton(story, button);
            if (redirect == TileFrame.ButtonState.UPDATE) story.getTile().updateRedirection(story, button);
        }
        content.put("html", story.getTile().getHtmlContent());
        content.put("button_html", story.getTile().generateButton());
        return ResponseEntity.status(HttpStatus.OK).body(content);
    }

}
