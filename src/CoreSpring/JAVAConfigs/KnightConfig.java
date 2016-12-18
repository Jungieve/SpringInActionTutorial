package CoreSpring.JAVAConfigs;

import CoreSpring.BraveKnight;
import CoreSpring.Knight;
import CoreSpring.Quest;
import CoreSpring.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by root on 2016/12/18.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
