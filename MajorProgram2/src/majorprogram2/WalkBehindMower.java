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
public class WalkBehindMower extends Mower 
{
  private double cutWidth; 
  private double wheelDiameter;   
  
  public WalkBehindMower()
  {
      cutWidth = 0.0;
      wheelDiameter = 0.0;
  }
  
     public void setCutWidth(double enter)
      {
         cutWidth = enter;
      }
      
      public double getCutWidth()
      {
          return cutWidth;
      }
      
      public void setWheelDiameter(double enter)
      {
         wheelDiameter = enter;
      }
      
       public double getWheelDiameter()
      {
          return wheelDiameter;
      }
       
       public String toString()
       {
           return "W"+"\n"+super.toString()+"\n"+cutWidth+"\n"+wheelDiameter;
       }
}
