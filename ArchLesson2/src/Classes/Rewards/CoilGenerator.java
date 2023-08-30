package Classes.Rewards;

import Classes.ItemFactory;
import Classes.RewardItem;

public class CoilGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        CoilReward reward = new CoilReward();
        reward.open();
        return reward;
    }
}
