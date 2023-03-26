package fr.paralax.server.route;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        session.setAttribute("story_token", "e69f772c-b4e0-49b1-9ab5-dce32e018450");
        return new ModelAndView("index");
    }

}
