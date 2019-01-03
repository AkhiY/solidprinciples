package com.stackroute;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Manager manager = new Manager();
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        CarInsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor();
        manager.proccesClaim(healthInsuranceSurveyor);


    }
}
