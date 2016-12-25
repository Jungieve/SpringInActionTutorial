package CoreSpring.AdvancedWiring.Dessert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by congzihan on 16/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DinnerConfig.class)
public class DinnerTest {
    @Autowired
    private Meal meal;

    @Test
    public void checkDinner() throws Exception {
        assert (meal != null);
    }

}