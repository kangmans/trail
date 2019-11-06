/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veg;

/**
 *
 * @author sivagama
 * Carrot is the subclass of abstract class Vegetables and also an example Multiple Inheritance in Java
 */
public class Carrot extends Vegetables implements Organic
{
    public Carrot(String n,String c)
    {
        super(n,c);
    }
    //implements Vegetables abstract method isTasty
    @Override
    public boolean isTasty()
    {
        return true;
    }

    /**
     *implements interface method grow()
     */
    @Override
    public void grow()
{
   System.out.println("used Pesticides? :" +USE_PESTICIDES);

}
}
