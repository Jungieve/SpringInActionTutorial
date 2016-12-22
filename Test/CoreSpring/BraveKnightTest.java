package CoreSpring;

import CoreSpring.BraveKnight;
import CoreSpring.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * Created by root on 2016/12/17.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
