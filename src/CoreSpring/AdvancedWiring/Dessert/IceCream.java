package CoreSpring.AdvancedWiring.Dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by congzihan on 16/12/25.
 */
@Component
@Qualifier("cold")
public class IceCream implements Dessert {
}
