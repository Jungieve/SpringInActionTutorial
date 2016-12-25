package CoreSpring.AdvancedWiring.Dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by congzihan on 16/12/25.
 */
@Component
public class Dinner implements Meal {
    private Dessert dessert;

    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
