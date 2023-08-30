package Classes.Rewards;

import Classes.RewardItem;

public class GlassReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Glass");
    }
}
