package src.com.example.Vendingmachine.States;

import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;

public interface Machinestate {

    public void selectProduct(Vendingmachine machine, int rackNumber);

    public void inserCoins(Vendingmachine machine, int amount);

    public int cancel(Vendingmachine machine);

    public Product collectProduct(Vendingmachine machine);

    public int collectExtraChange(Vendingmachine machine);
}
