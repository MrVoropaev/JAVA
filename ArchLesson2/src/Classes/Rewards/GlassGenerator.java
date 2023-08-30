package Classes.Rewards;

import Classes.ItemFactory;
import Classes.RewardItem;

public class GlassGenerator extends ItemFactory {
    @Override
    public RewardItem createItem() {
        GlassReward gemReward = new GlassReward();
        gemReward.open();
        return gemReward;
    }
}
