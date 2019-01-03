package com.stackroute;

public class Fan implements ElectricAppliance{
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan is rotating...");

    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan is off...");

    }
}
