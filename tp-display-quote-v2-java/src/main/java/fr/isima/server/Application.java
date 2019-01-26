package fr.isima.server;


import fr.isima.business.Quotes;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@ComponentScan("fr.isima")
@EnableWebMvc
public class Application extends WebMvcAutoConfiguration {

    @Bean
    public Quotes quotes() {
        return Quotes.createDefaultQuotes();
    }
}
