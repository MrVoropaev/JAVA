package Classes.Rewards;

import Classes.ItemFactory;
import Classes.RewardItem;

public class RockGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        RockReward reward = new RockReward();
        reward.open();
        return reward;
    }
}
