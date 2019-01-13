package fr.isima.controllers

import fr.isima.service.HourGenerator
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/heure")
class HeureRestController constructor(private val generator: HourGenerator) {

    @GetMapping
    fun heure() = this.generator.nowWithStandardFormat()
}

