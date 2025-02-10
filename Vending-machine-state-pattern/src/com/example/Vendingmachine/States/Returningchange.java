package src.com.example.Vendingmachine.States;

import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;

public class Returningchange implements Machinestate {

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'collectProduct'");
    }

    @Override
    public int collectExtraChange(Vendingmachine machine) {
        // TODO Auto-generated method stub
        Product item = machine.getSelectedRack().getProduct();
        int amountAdded = machine.getAmountAdded();
        int change = amountAdded - item.getProductPrice() ;
        machine.setAmountAdded(0);
        machine.setSelectedRack(null);
        System.out.println("Please Colllect your Change if applicable");
        return change;
    }

}
