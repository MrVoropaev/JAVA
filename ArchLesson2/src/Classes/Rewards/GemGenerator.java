package Classes.Rewards;

import Classes.RewardItem;
import Classes.ItemFactory;

public class GemGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        GemReward gemReward = new GemReward();
        gemReward.open();
        return gemReward;

    }
}
