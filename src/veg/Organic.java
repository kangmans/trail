/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veg;

/**
 *
 * @author sivagama
 * Creating an Interface which only contains constants and abstract method.
 * subclass must implement all abstract methods
 */
public interface Organic 
{
//constants are required
public boolean USE_PESTICIDES=false; 
//public int NO=453;
// abstract menthod
public abstract void grow();

}
