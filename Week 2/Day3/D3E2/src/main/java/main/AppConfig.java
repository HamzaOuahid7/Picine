package main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"main"})
public class AppConfig {

    @Bean
    public TimeItAspect timeItAspect() {
        return new TimeItAspect();
    }
}