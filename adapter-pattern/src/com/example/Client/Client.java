package com.example.Client;

import com.example.adapter.ChildWeightAdapter;
import com.example.adapter.WeightAdapter;
import com.example.adaptee.ChildWeightMachine;

public class Client {
    public static void main(String[] args) {
        WeightAdapter adapter = new ChildWeightAdapter(new ChildWeightMachine());
    
        // Here Adapter Class Will be having a reference to Adaaptee.
        // basicall here adaper class is responsible for a Bridge between Clieint and Adaptee
        // Adapptee returns some data in a a form which client cannot understand , so it needs a adapter which 
        // can convert the data for client to understand

        System.out.println(adapter.getWeightInKilograms());
    }

}
