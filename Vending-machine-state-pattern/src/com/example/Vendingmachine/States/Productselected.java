package src.com.example.Vendingmachine.States;

import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;


public class Productselected implements Machinestate {

    public Productselected() {
    }

    @Override
    public void selectProduct(Vendingmachine machine, int rackNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void inserCoins(Vendingmachine machine, int amount) {
        int amountAdded = machine.getAmountAdded() + amount;
        machine.setAmountAdded(amountAdded);
        int priceProduct = machine.getSelectedRack().getProduct().getProductPrice();
        if (priceProduct > amountAdded) {
            System.out.println(String.format("Please Enter %d more Amount", priceProduct - amount));
            return;
        }
        machine.setState(new Dispensingproduct());
    }

    @Override
    public int cancel(Vendingmachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }

    @Override
    public Product collectProduct(Vendingmachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectProduct'");
    }

    @Override
    public int collectExtraChange(Vendingmachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectExtraChange'");
    }

}
