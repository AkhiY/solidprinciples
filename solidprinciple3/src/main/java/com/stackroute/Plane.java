package com.stackroute;

import java.math.BigDecimal;

public class Plane  implements Moveable, Flyable,Toy
{
    public void moving()
    {
        System.out.println("this plane can Moveable");
    }
    public void flying()
    {
        System.out.println("this plane can Flyable");
    }

    @Override
    public void setPrice(BigDecimal price) {

    }

    @Override
    public void setColor(String color) {

    }
}
