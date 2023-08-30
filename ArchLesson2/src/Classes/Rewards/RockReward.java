package Classes.Rewards;

import Classes.RewardItem;

public class RockReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Rock");
    }
}
