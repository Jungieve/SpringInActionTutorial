package CoreSpring.AspectOrientedSpring.SoundSystemCounter;

import CoreSpring.WiringBeans.SoundSystem.BlankDisc;
import CoreSpring.WiringBeans.SoundSystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by congzihan on 16/12/30.
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        List<String> tracks = new ArrayList();
        tracks.add("Sgt.Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help From my Friends");
        tracks.add("Lucy in the sky with diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        BlankDisc cd = new BlankDisc("Sgt.Pepper's Lonely Hearts Club Band", "The Beatles", tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
