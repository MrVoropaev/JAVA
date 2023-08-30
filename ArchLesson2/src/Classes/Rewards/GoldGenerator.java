package Classes.Rewards;

import Classes.RewardItem;
import Classes.ItemFactory;

public class GoldGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        GoldReward reward = new GoldReward();
        reward.open();
        return reward;
    }
}
