package com.stackroute;

import java.math.BigDecimal;

public class Car implements Moveable,Toy
{
    public void moving()
    {
        System.out.println("this car can Moveable");
    }

    @Override
    public void setPrice(BigDecimal price) {
        System.out.println();

    }

    @Override
    public void setColor(String color) {

    }
}
