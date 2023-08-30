package Classes.Rewards;

import Classes.RewardItem;

public class GoldReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
