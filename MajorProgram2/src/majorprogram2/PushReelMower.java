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
    private int numWheels;
    
    public PushReelMower()
    {
        numWheels = 0;
    }
    
    public String toString()
    {
        return super.toString()+"P"+"\n"+Integer.toString(numWheels);
    }
}
