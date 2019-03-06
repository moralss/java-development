package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer kagiso = new Customer("kagiso" , 543.33);
        Branch branch = new Branch("Same" , kagiso );

        

        System.out.println("hello world" + branch.getListOfCustomers());
    }
}
