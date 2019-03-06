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
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
        }
    }


    private Customer findCustomer(String customerName){
        for(int i = 0 ; i < this.customers.size() ; i++){
            Customer iteratedCustomer =  this.customers.get(i);
            if(iteratedCustomer.getCustomer().equals(customerName)){
                return iteratedCustomer;
            }
        }

        return null;

    }



    public String getBranch() {
        return this.branch;
    }


    public ArrayList<Customer> getListOfCustomers(){
        return this.customers;
    }

}
