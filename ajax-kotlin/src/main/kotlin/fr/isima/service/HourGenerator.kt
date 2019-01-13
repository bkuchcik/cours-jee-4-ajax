package fr.isima.service

import org.springframework.stereotype.Component

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val FORMAT_STANDARD_DATE = "HH:mm:ss 'le' dd/MM/yyyy"

@Component
class HourGenerator {
    fun nowWithStandardFormat(): Hour =
        LocalDateTime.now().run {
            Hour(this, DateTimeFormatter.ofPattern(FORMAT_STANDARD_DATE).format(this))
        }
}

class Hour internal constructor(val unformatted: LocalDateTime, val formatted: String)
