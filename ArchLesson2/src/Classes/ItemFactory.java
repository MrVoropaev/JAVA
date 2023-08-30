package Classes;

public abstract class ItemFactory {
    public void openReward(){
        createItem();
    }
    public abstract RewardItem createItem();
}
