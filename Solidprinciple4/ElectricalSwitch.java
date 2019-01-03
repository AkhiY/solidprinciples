package com.stackroute;

public class ElectricalSwitch implements Switch {
    private boolean state = true;

    private ElectricAppliance electricAppliance;

    public ElectricalSwitch(ElectricAppliance electricAppliance)
    {
        this.electricAppliance =electricAppliance ;
    }


    @Override
    public void press() {
        if (this.state == true) {
            this.state = false;
            electricAppliance.turnOff();
        } else {
            this.state = true;
            electricAppliance.turnOn();
        }
    }



}

