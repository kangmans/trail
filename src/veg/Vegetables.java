/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veg;

/**
 *
 * @author Sivagama
 * This example to learn the abstract class and abstract method
 */
public abstract class Vegetables 
{
private String Name;
private String color;
public Vegetables(String n,String c)
{
    this.Name=n;
    this.color=c;
}
public abstract boolean isTasty();

    /**
     * @return the Name
     */
    public String getName()
    {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) 
    {
        this.Name = Name;
    }

    /**
     * @return the color
     */
    public String getColor() 
    {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color)
    {
        this.color = color;
    }

  /*boolean grow() 
  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
