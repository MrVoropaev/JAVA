package Classes.Rewards;

import Classes.RewardItem;

public class SilverReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}
