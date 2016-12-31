package CoreSpring.WiringBeans.SoundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by congzihan on 16/12/22.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title +" by " + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing " + title + " by " + artist);
    }
}
