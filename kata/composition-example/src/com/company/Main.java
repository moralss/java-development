package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Resolution resolution = new Resolution(55,200);
        Monitor monitor = new Monitor("Sumsung" , resolution);

        System.out.println(monitor.getMonitor());
    }
}
