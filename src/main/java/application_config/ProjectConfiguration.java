package application_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"proxy", "service", "repository"})
public class ProjectConfiguration {
}
