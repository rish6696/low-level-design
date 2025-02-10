package src.com.example.Vendingmachine.States;

import src.com.example.Vendingmachine.Machine.Rack;
import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;

public class Idlestate implements Machinestate {

    public Idlestate() {

    }

    @Override
    public void selectProduct(Vendingmachine machine, int rackNumber) {
        Rack rack = machine.getRack(rackNumber);
        if (rack == null) {
            System.out.println("Invalid Rack Number Pass Please Renter the Rack");
            return;
        }
        machine.setSelectedRack(rack);
        machine.setState(new Productselected());
    }

    @Override
    public void inserCoins(Vendingmachine machine, int amount) {
        // TODO Auto-generated method stub
        System.out.println("Please Select the product first which you want to buy");
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
