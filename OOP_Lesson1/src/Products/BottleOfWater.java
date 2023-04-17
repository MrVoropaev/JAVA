package OOP_Lesson1.src.Products;

public class BottleOfWater extends Product {
    
    private int volume;

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
/**
 * Количество бутылок воды
 * @param volume
 */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                '}';
    }

}