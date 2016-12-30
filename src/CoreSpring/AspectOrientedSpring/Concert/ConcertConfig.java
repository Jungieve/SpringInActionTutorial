package CoreSpring.AspectOrientedSpring.Concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by congzihan on 16/12/30.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
