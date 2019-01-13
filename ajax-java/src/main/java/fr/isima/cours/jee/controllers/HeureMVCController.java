package fr.isima.cours.jee.controllers;

import fr.isima.cours.jee.service.HourGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/heure")
public class HeureMVCController {

    private final HourGenerator generator;

    @Autowired
    public HeureMVCController(HourGenerator generateurHeureCourante) {
        this.generator = generateurHeureCourante;
    }

    @GetMapping
    public ModelAndView heure() {
        return new ModelAndView("heureCourante", "currentDateAsString", this.generator.nowWithStandardFormat().getFormatted());
    }

}
