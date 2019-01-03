package com.stackroute;
import org.junit.Test;


public class Main {
    ElectricalSwitch es = new ElectricalSwitch();
    Bulb lb=new Bulb();
    @Test
    public void electric() {
        es.electricBulb(lb);

    }

}
