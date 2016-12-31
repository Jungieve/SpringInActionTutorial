package CoreSpring.AspectOrientedSpring.SoundSystemCounter;

import CoreSpring.WiringBeans.SoundSystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by congzihan on 16/12/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterConfigTest {
    @Autowired
    private CompactDisc compactDisc;
    @Autowired
    private TrackCounter counter;

    @Test
    public void trackCounter() throws Exception {
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(4);
        compactDisc.playTrack(2);
        compactDisc.playTrack(2);
        assert (counter.getPlayCount(2) == 3);
        assert (counter.getPlayCount(3) == 1);
    }

}