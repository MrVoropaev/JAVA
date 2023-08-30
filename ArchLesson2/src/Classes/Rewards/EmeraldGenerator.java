package Classes.Rewards;

import Classes.RewardItem;
import Classes.ItemFactory;

public class EmeraldGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
            EmeraldReward gemReward = new EmeraldReward();
            gemReward.open();
            return gemReward;
    }
}
