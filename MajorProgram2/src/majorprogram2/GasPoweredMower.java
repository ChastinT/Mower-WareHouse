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
     return super.toString()+"G"+"\n"+engine+"\n"+"Is it self propelled: "+selfPropelled;
 }
}
