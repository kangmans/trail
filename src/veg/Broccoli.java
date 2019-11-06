/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veg;

/**
 *
 * @author Sivagama
 * Broccoli is the subclass of abstract class Vegetables
 */
public class Broccoli extends Vegetables
{
    public Broccoli(String Name,String c)
    {
        super(Name,c);
    }
   //implements Vegetables abstract method isTasty
    @Override
    public boolean isTasty()
    {
      return true;  
    }
    

}
