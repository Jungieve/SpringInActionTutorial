package WiringBeans.SoundSystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by congzihan on 16/12/23.
 */
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:CDPlayerConfig.xml")
public class SoundSystemConfig {
}
