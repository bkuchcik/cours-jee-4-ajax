package fr.isima.cours.jee.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class HourGenerator {

    static final String FORMAT_STANDARD_DATE = "HH:mm:ss 'le' dd/MM/yyyy";

    public Hour nowWithStandardFormat() {
        final LocalDateTime unformatted = LocalDateTime.now();
        return new Hour(unformatted, DateTimeFormatter.ofPattern(FORMAT_STANDARD_DATE).format(unformatted));
    }
}
