package CoreSpring.AdvancedWiring.Conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by congzihan on 16/12/25.
 */

public class MagicBean {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
