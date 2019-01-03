package com.stackroute;

public class Manager {
    public void proccesClaim(Surveyor surveyor)
    {
        if(surveyor.isValid())
        {
            System.out.println("Approve");
        }

        else
        {
            System.out.println("Reject");
        }
    }
}
