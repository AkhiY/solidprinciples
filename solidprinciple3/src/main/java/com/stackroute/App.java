package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Bulb bulb=new Bulb();
        Fan fan=new Fan();
        ElectricalSwitch electricalSwitch=new ElectricalSwitch(fan);

        electricalSwitch.press();
        electricalSwitch.press();
        electricalSwitch.press();
        electricalSwitch.press();
        electricalSwitch.press();


    }
}
