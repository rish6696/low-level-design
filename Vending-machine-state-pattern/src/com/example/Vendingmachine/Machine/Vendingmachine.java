package src.com.example.Vendingmachine.Machine;

import src.com.example.Vendingmachine.Products.Productinventory;
import src.com.example.Vendingmachine.States.Idlestate;
import src.com.example.Vendingmachine.States.Machinestate;

public class Vendingmachine {

    private Productinventory productInventory;
    private Interactionboard interactionBoard;
    private Collectionbag collectionBag;
    private Rack[] racks;

    private Machinestate state;

    private Rack selectedRack;
    private int amountAdded;

    public int getAmountAdded() {
        return amountAdded;
    }

    public void setAmountAdded(int amountAdded) {
        this.amountAdded = amountAdded;
    }

    public Vendingmachine() {
        state = new Idlestate();
    }

    public Productinventory getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(Productinventory productInventory) {
        this.productInventory = productInventory;
    }

    public Interactionboard getInteractionBoard() {
        return interactionBoard;
    }

    public void setInteractionBoard(Interactionboard interactionBoard) {
        this.interactionBoard = interactionBoard;
    }

    public Collectionbag getCollectionBag() {
        return collectionBag;
    }

    public void setCollectionBag(Collectionbag collectionBag) {
        this.collectionBag = collectionBag;
    }

    public Rack[] getRacks() {
        return racks;
    }

    public void setRacks(Rack[] racks) {
        this.racks = racks;
    }

    public Machinestate execute() {
        return state;
    }

    public void setState(Machinestate state) {
        this.state = state;
    }

    public Rack getRack(int rackNumber) {
        if (rackNumber < 1 || rackNumber > 10 ){
            System.out.println("Invalid Rack Position");
            return null;
        }
        return this.racks[rackNumber - 1];
    }

    public Rack getSelectedRack() {
        return selectedRack;
    }

    public void setSelectedRack(Rack selectedRack) {
        this.selectedRack = selectedRack;
    }

}
