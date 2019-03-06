package com.company;

import java.util.ArrayList;

public class Branch {
    private String branch;
    private ArrayList<Customer> customers;


    public Branch(String branch ) {
        this.branch = branch;
        this.customers = new ArrayList<Customer>();

    }

    public boolean addNewCustomer(String customerName, double transaction ){
        this.customers.add(new Customer(customerName , transaction ));
        return true;
    }

    public void addTransation(String customerName , double transaction){
        if(customerName == findName(customerName)){

        }
    }


    private findName(){
        
    }



    public String getBranch() {
        return this.branch;
    }


    public ArrayList<Customer> getListOfCustomers(){
        return this.customers;
    }

}
