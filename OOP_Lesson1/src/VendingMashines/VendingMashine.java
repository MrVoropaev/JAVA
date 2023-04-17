package OOP_Lesson1.src.VendingMashines;

import OOP_Lesson1.src.Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    private List<Product> products;
    private List<String> workLog;
    private int volume;

    public VendingMashine(int volume) {
        this.volume = volume;
        this.products = new ArrayList<Product>();
        this.workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void addSales(String line) {
        workLog.add(line);
    }

    public Product getProdByName(String name) {
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll() {
        return products;
    }
}
