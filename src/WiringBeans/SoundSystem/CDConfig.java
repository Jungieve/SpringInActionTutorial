package WiringBeans.SoundSystem;

import org.springframework.context.annotation.Bean;

/**
 * Created by congzihan on 16/12/23.
 */
public class CDConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
