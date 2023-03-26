package fr.paralax.server.route;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        session.setAttribute("story_token", "54c89955-c0d7-469c-8222-a1cd09ec7124");
        return new ModelAndView("index");
    }

}
