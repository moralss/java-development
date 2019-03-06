package com.company;

import java.util.ArrayList;

public class Branch {
    private String branch;
    private ArrayList<Customer> customers;


    public Branch(String branch , Customer customer) {
        this.branch = branch;
        this.customers= new ArrayList<Customer>();
        addCustomer(customer);
    }

    public String getBranch() {
        return this.branch;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public ArrayList<Customer> getListOfCustomers(){
        return this.customers;
    }

}
