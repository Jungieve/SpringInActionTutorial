package WiringBeans.SoundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by congzihan on 16/12/22.
 */
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean(name = "lonelyHeartsClub")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
