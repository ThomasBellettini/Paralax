package fr.paralax.server.route.story;

import fr.paralax.server.ServerApplication;
import fr.paralax.server.entity.story.Story;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoryRoute {

    @GetMapping("/story")
    public ModelAndView story(HttpSession session) {
        String id = (String) session.getAttribute("story_token");
        if (id == null) return new ModelAndView("redirect:/?error=No Token found !");
        Story story = null;
        for (Story tmp : ServerApplication.getInstance.storyGStorage.getEntityList()) {
            if (tmp.getFileID().equalsIgnoreCase(id)) {
                story = tmp;
                break;
            }
        }
        if (story == null) new ModelAndView("redirect:/?error=Session Exprired !");
        return new ModelAndView("story");
    }

}
