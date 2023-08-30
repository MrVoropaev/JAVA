package Classes.Rewards;

import Classes.RewardItem;

public class EmeraldReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Emerald");
    }
}
