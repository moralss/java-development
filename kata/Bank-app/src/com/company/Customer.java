package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;


    public Customer(String customerName, double initalAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initalAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getCustomer(){
        return customerName;
    }

}
