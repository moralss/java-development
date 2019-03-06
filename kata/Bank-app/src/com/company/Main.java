package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Branch branch = new Branch("Same");
        branch.addNewCustomer("kagiso", 556);
        branch.addNewCustomer("Moral" , 532.453);

        ArrayList<Customer> listOfCustomers = branch.getListOfCustomers();

        for(int i = 0 ; i < listOfCustomers.size() ; i++){
            System.out.println("hello world" + listOfCustomers.get(i).getCustomer());
        }

    }
}
