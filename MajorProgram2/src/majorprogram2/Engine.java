/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author Chastin
 */
public class Engine 
{
    private String manufacturer;
    private double horsePower;
    private int cylinders;
    
    public Engine()
    {
        manufacturer = "";
        horsePower = 0.0;
        cylinders = 0;
    }
    
      public Engine(String manufacturer,double horsePower,int cylinders)
    {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }
      
      public void setManufacturer(String enter)
      {
          manufacturer = enter;
      }
      
      public String getManufacturer()
      {
          return manufacturer;
      }
      
       public void setHorsePower(double enter)
      {
         horsePower = enter;
      }
      
      public double getHorsePower()
      {
          return horsePower;
      }
      
      public void setCylinders(int enter)
      {
         cylinders = enter;
      }
      
      public int getCylinders()
      {
          return cylinders;
      }
      
      public String toString()
      {
          return manufacturer+"\n"+horsePower+"\n"+cylinders+"\n";
      }
}
