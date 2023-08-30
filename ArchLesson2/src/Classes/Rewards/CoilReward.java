package Classes.Rewards;

import Classes.RewardItem;

public class CoilReward implements RewardItem {
    @Override
    public void open() {
        System.out.println("Coil");
    }
}
