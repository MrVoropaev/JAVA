package OOP_Lesson1.src.Products;

public class HotDrink extends Product {
    private int temperature;
/**
 * Конструктор для горячих напитков. Три параметра.
 * @param name название горячего напитка
 * @param price цена горячего напитка
 * @param temperature температура горячего напитка
 */
    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }
/** Получаем температуру напитка (устанавливает пользователь) */
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", temperature=" + temperature +
                '}';
    }

}
