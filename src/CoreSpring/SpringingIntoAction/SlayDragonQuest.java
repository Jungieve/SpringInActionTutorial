package CoreSpring.SpringingIntoAction;

import java.io.PrintStream;

/**
 * Created by congzihan on 16/12/18.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
