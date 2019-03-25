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
public class CommercialMower extends LawnTractor 
{
    private String type = "C";
 private double operatingHours;
 private boolean zeroTurnRadius;
 
 public CommercialMower()
 {
     operatingHours = 0.0;
     zeroTurnRadius = false;
 }
 
 public void setOperatingHours(double enter)
 {
     operatingHours = enter;
 }
 
 public double getOperatingHours()
 {
     return operatingHours;
 }
 
  public void setZeroTurnRadius(boolean enter)
 {
     zeroTurnRadius = enter;
 }
 
 public boolean getZeroTurnRadius()
 {
     return zeroTurnRadius;
 }
 
 public String toString()
 {
     return super.toString()+"C"+"\r\n"+super.getEngine()+"\r\n"+super.getModel()+"\r\n"+super.getDeckWidth()+"\r\n"+operatingHours+"\r\n"+"Does it have zeroTurnRadius: "+zeroTurnRadius+"\r\n";
 }
}
