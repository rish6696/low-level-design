package src.com.example.Vendingmachine.Products;

public class Product {

    private String productName;
    private int productPrice;
    private String productSku;

    public Product(String productName, int productPrice, String productSku) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSku = productSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

}
