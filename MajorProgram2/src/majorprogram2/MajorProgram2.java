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
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Engine testEngine = new Engine("Toyota",20.5,4);
        
       
        GasPoweredMower testPoweredMower = new GasPoweredMower();
        
        testPoweredMower.setEngine(testEngine);
        testPoweredMower.setManufacturer("Toyota");
        testPoweredMower.setYear(1999);
        testPoweredMower.setSerialNumber("daSADs94re");
        testPoweredMower.setCutWidth(20.5);
        testPoweredMower.setWheelDiameter(10.4);
        testPoweredMower.setSelfPropelled(true);
        System.out.println(testPoweredMower);
    }
    
}
