/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
    
  
     
     
    
    public String toString()
    {
        String output = storeName+"\r\n";
        for (int i = 0; i < wareHouse.size();i++)
        {
            output += wareHouse.get(i);
        }
        return output;
    }
 
    public void readMowerData(String inputFileName) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File(inputFileName));
        this.storeName = scan.nextLine();
        while (scan.hasNextLine())
        {
            String manufacturer = scan.nextLine();
            int year = Integer.parseInt(scan.nextLine());
            String serialNumber = scan.nextLine();
            String select = scan.nextLine();
            if (select.equals("L"))
            {
                Engine engine = new Engine(scan.nextLine(),Double.parseDouble(scan.nextLine()),Integer.parseInt(scan.nextLine()));
                LawnTractor L = new LawnTractor();
                L.setManufacturer(manufacturer);
                L.setYear(year);
                L.setSerialNumber(serialNumber);
                L.setEngine(engine);
                L.setModel(scan.nextLine());
                L.setDeckWidth(Double.parseDouble(scan.nextLine()));
                 wareHouse.add(L);
            }
            else
                if (select.equals("C"))
                {
                    Engine engine = new Engine(scan.nextLine(),Double.parseDouble(scan.nextLine()),Integer.parseInt(scan.nextLine()));
                    CommercialMower C = new CommercialMower();
                    C.setManufacturer(manufacturer);
                    C.setYear(year);
                    C.setSerialNumber(serialNumber);
                    C.setEngine(engine);
                    C.setModel(scan.nextLine());
                    C.setDeckWidth(Double.parseDouble(scan.nextLine()));
                    C.setOperatingHours(Double.parseDouble(scan.nextLine()));
                    C.setZeroTurnRadius(Boolean.getBoolean(scan.nextLine()));
                     wareHouse.add(C);
                }
                else 
                    if (select.equals("G"))
                    {
                         
                         GasPoweredMower G = new GasPoweredMower();
                         
                         G.setManufacturer(manufacturer);
                         G.setYear(year);
                         G.setSerialNumber(serialNumber);
                         G.setCutWidth(Double.parseDouble(scan.nextLine()));
                         G.setWheelDiameter(Double.parseDouble(scan.nextLine()));
                         Engine engine = new Engine(scan.nextLine(),Double.parseDouble(scan.nextLine()),Integer.parseInt(scan.nextLine()));
                         G.setEngine(engine);
                         G.setSelfPropelled(Boolean.getBoolean(scan.nextLine()));
                          wareHouse.add(G);
                    }
                   else
                        if (select.equals("P"))
                        {
                            PushReelMower P = new PushReelMower();
                            
                            P.setManufacturer(manufacturer);
                            P.setYear(year);
                            P.setSerialNumber(serialNumber);
                            P.setCutWidth(Double.parseDouble(scan.nextLine()));
                            P.setWheelDiameter(Double.parseDouble(scan.nextLine()));
                            P.setNumwheels(Integer.parseInt(scan.nextLine()));
                             wareHouse.add(P);
                        }
            else
                            if (select.equals("W"))
                            {
                                
                                WalkBehindMower W = new WalkBehindMower();
                                W.setManufacturer(manufacturer);
                                W.setYear(year);
                                W.setSerialNumber(serialNumber);
                                W.setCutWidth(Double.parseDouble(scan.nextLine()));
                                W.setWheelDiameter(Double.parseDouble(scan.nextLine()));
                                wareHouse.add(W);
                            }
        }
    }
    
     public void saveMowerData(String outputFileName) throws FileNotFoundException
    {
           try 
           {
               PrintWriter write = new PrintWriter(new File(outputFileName)); 
                  write.println(toString());  
                
               write.close();
        } 
           catch (java.io.IOException ex) 
           {
            return;
            }
    }
     
     
        public int getNumMowers() 
        {
        return wareHouse.size();
        }
    
        public Mower getMowers(int index) 
    {
        return wareHouse.get(index);
    }
    
        public void setMower(int index, Mower item) 
    {
        wareHouse.add(index, item);
    }
    
       public void addMower(Mower adder) 
    {
       wareHouse.add(adder);
    } 
        
        public Mower removeMower(int index) 
   {
       wareHouse.remove(index);
       
        return wareHouse.get(index);
    } 
}
        
    
 


