package com.company;

public class Monitor {
    private String model;
    private Resolution resolution;


    public Monitor(String model, Resolution resolution) {
        this.model = model;
        this.resolution = resolution;
    }

    public String getMonitor(){
        return "name " + this.model + " width " + this.resolution.getWidth() + " height " + this.resolution.getHeight();
    }
}


