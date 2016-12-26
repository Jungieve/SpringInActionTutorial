package CoreSpring.AdvancedWiring.External;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by congzihan on 16/12/27.
 */
@Configuration
@PropertySource("classpath:/CoreSpring/AdvancedWiring/app.properties")
public class ExpressiveConfig {
    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {
        return new BlankDisc(environment.getProperty("disc.title"),
                environment.getProperty("disc.artist"));
    }

}
