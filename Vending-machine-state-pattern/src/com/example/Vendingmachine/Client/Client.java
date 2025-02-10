package src.com.example.Vendingmachine.Client;

import src.com.example.Vendingmachine.Machine.Button;
import src.com.example.Vendingmachine.Machine.Collectionbag;
import src.com.example.Vendingmachine.Machine.Interactionboard;
import src.com.example.Vendingmachine.Machine.Vendingmachine;
import src.com.example.Vendingmachine.Products.Product;
import src.com.example.Vendingmachine.Products.Productinventory;
import src.com.example.Vendingmachine.Machine.Rack;

public class Client {
    public static void main(String[] args) {
        System.out.println("WelCome to Vending Machine");

        Vendingmachine vendingMachine = new Vendingmachine();
        Product bisleriBottle = new Product("Bisleri Water Bottle", 20, "28384839");

        Productinventory inventory = new Productinventory();
        Collectionbag collectionbag = new Collectionbag();

        Rack[] racks = new Rack[10];
        for (int i = 0; i < racks.length; i++) {
            racks[i] = new Rack(i + 1);
        }

        racks[0].setProduct(bisleriBottle);

        Button[] buttons = new Button[10];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(String.format("%d", i + 1));
        }
        Interactionboard interactionboard = new Interactionboard(buttons);

        inventory.addProduct(bisleriBottle);

        vendingMachine.setProductInventory(inventory);
        vendingMachine.setCollectionBag(collectionbag);
        vendingMachine.setInteractionBoard(interactionboard);
        vendingMachine.setRacks(racks);

        vendingMachine.execute().selectProduct(vendingMachine, 1);
        vendingMachine.execute().inserCoins(vendingMachine, 10);
        vendingMachine.execute().inserCoins(vendingMachine, 100);

        Product bisleri = vendingMachine.execute().collectProduct(vendingMachine);
        System.out.println(String.format("Received the product with Name %s", bisleri.getProductName()));

        int change = vendingMachine.execute().collectExtraChange(vendingMachine);
        System.out.println(String.format("Received the Exta Coins as %d", change));
    }
}
