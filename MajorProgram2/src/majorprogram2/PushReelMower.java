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
public class PushReelMower extends WalkBehindMower
{
    private String type = "P";
    
    private int numWheels;
    
    public PushReelMower()
    {
        numWheels = 0;
    }
    
    public void setNumwheels(int enter)
    {
        numWheels = enter;
    }
    
    public int getNumwheels()
    {
       return numWheels;
    }
    
    public String toString()
    {
        return super.getManufacturer()+"\r\n"+super.getYear()+"\r\n"+super.getSerialNumber()+"\r\n"+"P"+"\r\n"+super.getCutWidth()+"\r\n"+super.getWheelDiameter()+"\r\n"+Integer.toString(numWheels)+"\r\n";
    }
}
