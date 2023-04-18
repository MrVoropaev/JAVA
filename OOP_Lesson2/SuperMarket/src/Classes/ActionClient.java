
package Classes;

public class ActionClient extends Actor {
    private int discountPercent;
    private int price;

    public ActionClient(String name, int discountPercent) {
        super(name);
        this.discountPercent = discountPercent;
    }

    @Override
    public String getName() {
        return "ActionClient: " + super.name;
    }
    
    public int getDiscountPercent() {
        return discountPercent;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // Реализация метода изменения статуса заказа
    }

    @Override
    public void setTakeOrder(boolean picUpOrder) {
        // Реализация метода изменения статуса получения заказа
    }

    @Override
    public ActionClient getActor() {
        // Вернуть текущий объект
        return this;
    }

    public void makeOrder(int initialPrice) {
        this.price = calculatePriceWithDiscount(initialPrice);
        // Дополнительная логика
    }

    private int calculatePriceWithDiscount(int price) {
        return price * (100 - discountPercent) / 100;
    }
}
