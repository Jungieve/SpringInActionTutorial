package CoreSpring.SpringingIntoAction;

/**
 * Created by root on 2016/12/17.
 */
public class DamselRescuingKnight implements Knight {
    private Quest quest;

    public DamselRescuingKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
