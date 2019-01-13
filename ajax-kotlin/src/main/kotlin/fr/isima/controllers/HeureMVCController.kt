package fr.isima.controllers

import fr.isima.service.HourGenerator
import fr.isima.view.toHtml
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/heure")
class HeureMVCController @Autowired
constructor(private val generator: HourGenerator) {

    @GetMapping
    @ResponseBody
    fun heure() = this.generator.nowWithStandardFormat().toHtml()

}
