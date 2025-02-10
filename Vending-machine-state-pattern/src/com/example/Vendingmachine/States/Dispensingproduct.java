package src.com.example.Vendingmachine.States;

import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;

public class Dispensingproduct implements Machinestate {

    @Override
    public void selectProduct(Vendingmachine machine, int rackNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void inserCoins(Vendingmachine machine, int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserCoins'");
    }

    @Override
    public int cancel(Vendingmachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }

    @Override
    public Product collectProduct(Vendingmachine machine) {
        Product orderItem = machine.getSelectedRack().getProduct();
        machine.setState(new Returningchange());
        return orderItem;
    }

    @Override
    public int collectExtraChange(Vendingmachine machine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectExtraChange'");
    }    
}
