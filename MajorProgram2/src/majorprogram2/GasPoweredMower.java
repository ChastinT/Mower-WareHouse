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
public class GasPoweredMower extends WalkBehindMower 
{
    private String type = "G";
    private Engine engine;
    private boolean selfPropelled;
    
    public GasPoweredMower()
    {
        engine = null;
        selfPropelled = false;
    }
    
     public void setEngine(Engine enter)
 {
     engine = enter;
 }
 
 public Engine getEngine()
 {
     return engine;
 }
 
  public void setSelfPropelled(boolean enter)
 {
     selfPropelled = enter;
 }
 
 public boolean getSelfPropelled()
 {
     return selfPropelled;
 }
 
 public String toString()
 {
     return super.getManufacturer()+"\r\n"+super.getYear()+"\r\n"+super.getSerialNumber()+"\r\n"+"G"+"\r\n"+super.getCutWidth()+"\r\n"+super.getWheelDiameter()+"\r\n"+engine+"\r\n"+"Is it self propelled: "+selfPropelled+"\r\n";
 }
}
