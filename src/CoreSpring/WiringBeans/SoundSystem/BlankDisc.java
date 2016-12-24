package CoreSpring.WiringBeans.SoundSystem;

import java.util.List;

/**
 * Created by congzihan on 16/12/23.
 */
public class BlankDisc implements CompactDisc {
    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    private String title;
    private String artist;
    private List<String> tracks;
    @Override
    public void play() {
        System.out.println("Playing " + title + " by "+artist);
        for(String track : tracks)
            System.out.println("~Track: " + track);
    }
}
