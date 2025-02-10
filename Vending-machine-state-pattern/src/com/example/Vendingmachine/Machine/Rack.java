package src.com.example.Vendingmachine.Machine;

import src.com.example.Vendingmachine.Products.Product;

public class Rack {

    private int rackNumber;
    private Product product;

    public Rack(int rackNumber) {
        this.rackNumber = rackNumber;
    }

    public boolean isEmpty() {
        return product == null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }

}
