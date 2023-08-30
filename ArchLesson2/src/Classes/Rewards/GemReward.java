package Classes.Rewards;

import Classes.RewardItem;

public class GemReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}
