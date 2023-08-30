package Classes.Rewards;

import Classes.ItemFactory;
import Classes.RewardItem;

public class AmetistGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        AmetistReward reward = new AmetistReward();
        reward.open();
        return reward;
    }
}
