package com.dimitri;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       PriceMaker tester = new PriceMakerImpl();
       System.out.println("The price of the items are: "+ tester.fullPrice(10,2.50));
    }
}
