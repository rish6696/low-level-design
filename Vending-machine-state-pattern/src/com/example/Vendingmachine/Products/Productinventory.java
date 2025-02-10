package src.com.example.Vendingmachine.Products;

import java.util.ArrayList;
import java.util.List;

public class Productinventory {

    private List<Product> products;

    public Productinventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
