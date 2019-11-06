/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veg;
import java.util.ArrayList;
/**
 *
 * @author sivagama
 */
public class StirFry 
{
public static void main(String args[])
{
    //Using Array
   /* Vegetables[] vegg=new Vegetables[2];
    vegg[0]=new Carrot("carrot","red");
    vegg[1]=new Broccoli("Brocolli","green");
    System.out.println(vegg[1].getName()+ " " + vegg[1].getColor());*/
    ArrayList<Vegetables> vegg=new ArrayList();
    Vegetables v1=new Carrot("carrot","red");
    Vegetables v2=new Broccoli("Brocolli","green");
    vegg.add(v1);
    vegg.add(v2);
    /* Using get method of ArrayList printing instance details
    System.out.println(vegg.get(0).getName());
    System.out.println(vegg.get(0).getColor());
    System.out.println(vegg.get(1).getName());
    System.out.println(vegg.get(1).getColor());*/
    boolean tasteGood=true;
    for(Vegetables v:vegg)
    {
       if(v.isTasty()==false)
        {
            tasteGood=false;
           break;
       
        }
       //System.out.println(v.getName()+v.getColor()+ " :" + v.isTasty()); 
    } 
    System.out.println("Used Abstract method implemented in subclass for finding Taste Good  :"+ tasteGood);
    
   /*
  Once a Java class implements an Java interface you 
   can use an instance of that class as an instance of that interface*/
    
   Organic check=new Carrot("sd","sdf"); 
     
   check.grow(); //to call implemented interface method in subclass
     
}
        
}
