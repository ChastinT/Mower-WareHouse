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
public abstract class Mower 
{
  private  String manufacturer;
   private int year;
   private String serialNumber;
   
   public Mower()
   {
       manufacturer = "";
       year = 0;
       serialNumber = "";
   }

    
       public void setManufacturer(String enter)
      {
          manufacturer = enter;
      }
      
      public String getManufacturer()
      {
          return manufacturer;
      }
      
          public void setYear(int enter)
      {
         year = enter;
      }
      
      public int getYear()
      {
          return year;
      }
      
       public void setSerialNumber(String enter)
      {
         serialNumber = enter;
      }
      
      public String getSerialNumber()
      {
          return serialNumber;
      }
      
      public void setMower(String manufacturer,int year,String serialNumber)
      {
       this.manufacturer = manufacturer;
       this.year = year;
       this.serialNumber = serialNumber;
      }
      
      public String toString()
      {
          return manufacturer+"\r\n"+year+"\r\n"+serialNumber+"\r\n";
      }
      
     
}
