package CoreSpring.WiringBeans.SoundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by congzihan on 16/12/23.
 */
@Configuration
public class CDConfig {
    @Bean(name = "lonelyHeartsClub")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
