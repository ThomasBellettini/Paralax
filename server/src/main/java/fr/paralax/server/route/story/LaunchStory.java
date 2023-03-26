package fr.paralax.server.route.story;

import fr.paralax.server.ServerApplication;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.story.thomas_b.StartGame;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LaunchStory {

    @PostMapping("/login")
    public RedirectView login(@RequestParam("id") String id, @RequestParam("password") String password, HttpSession session) {
        if (id == null || password == null) return new RedirectView("/?error=Bad Request");

        for (Story story : ServerApplication.getInstance.storyGStorage.getEntityList()) {
            if (story.getStoryName().equalsIgnoreCase(id)) {
                if (story.isSamePass(password)) {
                    session.setAttribute("story_token", story.getFileID());
                    return new RedirectView("/story");
                } else return new RedirectView("/?error=Wrong password");
            }
        }
        return new RedirectView("/?error=No user found !");
    }

    @PostMapping("/register")
    public RedirectView register(@RequestParam("id") String id, @RequestParam("password") String password, HttpSession session) {
        if (id == null || password == null) return new RedirectView("/");

        for (Story story : ServerApplication.getInstance.storyGStorage.getEntityList()) {
            if (story.getStoryName().equalsIgnoreCase(id)) {
                return new RedirectView("/?error=Already Exist");
            }
        }
        final Story story = new Story(id, password, new StartGame().getUuid());
        ServerApplication.getInstance.storyGStorage.saveEntity(story);
        session.setAttribute("story_token", story.getFileID());
        return new RedirectView("/story");
    }

}
