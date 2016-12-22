package WiringBeans.SoundSystem;

import org.apache.log4j.spi.LoggerFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by congzihan on 16/12/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;
    @Test
    public void cdShouldNotBeNull(){
        assert (cd != null);
    }
    @Test
    public void play(){
        player.play();
    }
}