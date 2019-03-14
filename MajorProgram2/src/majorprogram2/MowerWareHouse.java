/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.util.ArrayList;

/**
 *
 * @author Chastin
 */
public class MowerWareHouse 
{
    private String storeName;
    private ArrayList <Mower> wareHouse = new ArrayList<Mower>();     

    public MowerWareHouse()
    {
        storeName = "";
        wareHouse = new ArrayList<Mower>();
    }
    
    
    public void setStoreName(String enter)
    {
        storeName = enter;
    }
    
    public String getStoreName()
    {
        return storeName;
    }
    
     public void setWareHouse(ArrayList <Mower> enter)
    {
        wareHouse = enter;
    }
    
    public ArrayList<Mower> getWareHouse()
    {
        return wareHouse;
    }
    
    public String toString()
    {
        String output = storeName+"\n";
        for (int i = 0; i < wareHouse.size();i++)
        {
            output += wareHouse.get(i)+"\n";
        }
        return output;
    }
 /*
    public void readMowerData(String inputFileName)
    {
        
    }
    
     public void saveMowerData(String outputFileName)
    {
        
    }
*/
}
