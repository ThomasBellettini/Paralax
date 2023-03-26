package fr.paralax.server.route.story;

import fr.paralax.server.ServerApplication;
import fr.paralax.server.entity.TileFrame;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.langage.LanguageUtils;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
            System.out.println(button);
            String equalsText = story.getTile().getFromButtonUUID(button);
            System.out.println(equalsText);

            TileFrame.ButtonState redirect = story.getTile().onClickOnButton(story, equalsText);
            if (redirect == TileFrame.ButtonState.UPDATE) {
                story.getTile().updateRedirection(story, equalsText);
                ServerApplication.getInstance.storyGStorage.saveEntity(story);
            }
        }
        content.put("html", LanguageUtils.translate(story.getTile().getHtmlContent()));
        content.put("button_html", LanguageUtils.translate(story.getTile().generateButton()));
        content.put("background", (story.getTile().getPictureBackground().contains("https") ? String.format("url(\'%s\')", story.getTile().getPictureBackground()) : story.getTile().getPictureBackground()));
        content.put("antagonist", story.getTile().getPictureAntagonist());
        content.put("protagonist", story.getTile().getPictureProtagonist());
        return ResponseEntity.status(HttpStatus.OK).body(content);
    }

}
