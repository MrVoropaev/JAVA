package Classes.Rewards;

import Classes.ItemFactory;
import Classes.RewardItem;

public class SilverGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        SilverReward reward = new SilverReward();
        reward.open();
        return reward;
    }
}
