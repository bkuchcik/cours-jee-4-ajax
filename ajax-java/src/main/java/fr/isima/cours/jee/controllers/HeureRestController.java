package fr.isima.cours.jee.controllers;

import fr.isima.cours.jee.service.Hour;
import fr.isima.cours.jee.service.HourGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/heure")
public class HeureRestController {

    private final HourGenerator generator;

    @Autowired
    public HeureRestController(HourGenerator generateurHeureCourante) {
        this.generator = generateurHeureCourante;
    }

    @GetMapping
    public Hour heure() {
        return this.generator.nowWithStandardFormat();
    }
}

