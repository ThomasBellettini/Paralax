package fr.paralax.server.route;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {

    @GetMapping("/")
    public ModelAndView index(@RequestParam(value = "error", defaultValue = "none", required = false) String error, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (!error.equalsIgnoreCase("none"))
            if (session.getAttribute("story_token") != null) session.removeAttribute("story_token");
        modelAndView.addObject("error", error);

        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView index(HttpSession session) {
        if (session.getAttribute("story_token") != null) return new ModelAndView("redirect:/?error=Session Expired");
        ModelAndView modelAndView = new ModelAndView("register");
        return modelAndView;
    }

}
