package isep.web.sakila.webapi.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "isep.web.sakila.webapi" })
public class MvcConfig implements WebMvcConfigurer {

}
