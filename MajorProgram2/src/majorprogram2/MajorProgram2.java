/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Chastin
 */
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    private static int result;
    public static void main(String[] args) throws FileNotFoundException 
    {
        /*
        
        Engine testEngine = new Engine("Toyota",20.5,4);
        ArrayList <Mower> setter = new ArrayList<Mower>();
       
        Mower testMower = new Mower("Forza",2041,"CAPe2w");
        setter.add(testMower);
        
        GasPoweredMower testPoweredMower = new GasPoweredMower();
        testPoweredMower.setEngine(testEngine);
        testPoweredMower.setManufacturer("Toyota");
        testPoweredMower.setYear(1999);
        testPoweredMower.setSerialNumber("daSADs94re");
        testPoweredMower.setCutWidth(20.5);
        testPoweredMower.setWheelDiameter(10.4);
        testPoweredMower.setSelfPropelled(true);
        setter.add(testPoweredMower);
        
        PushReelMower testPushMower = new PushReelMower();
         testPushMower.setManufacturer("Honda");
        testPushMower.setYear(1943);
        testPushMower.setSerialNumber("Let1T3Nd");
        testPushMower.setCutWidth(2.3);
        testPushMower.setWheelDiameter(8.1);
        testPushMower.setNumwheels(4);
        setter.add(testPushMower);
        
        
        LawnTractor testTractor = new LawnTractor();
        testEngine = new Engine("Burnout",07.9,4);
        testTractor.setEngine(testEngine);
        testTractor.setDeckWidth(16);
        testTractor.setModel("Flux99");
         testTractor.setManufacturer("Diabolo");
        testTractor.setYear(1812);
        testTractor.setSerialNumber("Safnafa00033");
         setter.add(testTractor);
         
         CommercialMower testCommercial = new CommercialMower();
         testCommercial.setDeckWidth(5.5);
         testEngine = new Engine("Need4Speed",6.8,1);
         testCommercial.setEngine(testEngine);
         testCommercial.setOperatingHours(8.9);
         testCommercial.setZeroTurnRadius(true);
         testCommercial.setModel("DutyOPs");
         testCommercial.setManufacturer("BreakDown");
         testCommercial.setYear(1999);
         testCommercial.setSerialNumber("Joyride");
         setter.add(testCommercial);
         
         WalkBehindMower testBehind = new WalkBehindMower();
         testBehind.setCutWidth(4.6);
         testBehind.setWheelDiameter(20.5);
           testBehind.setManufacturer("FINISH IT");
        testBehind.setYear(1979);
        testBehind.setSerialNumber("COLDFIRE3234");
        setter.add(testBehind);
        
                
        MowerWareHouse wareHouse = new MowerWareHouse();
        wareHouse.setStoreName("Random Store Name");
        wareHouse.setWareHouse(setter);
       
       JOptionPane.showMessageDialog(null,wareHouse);
       */
        
        MowerWareHouse wareHouse = new MowerWareHouse();
        
        JFileChooser chooser = new JFileChooser("C:\\Users\\Chastin\\COMP167\\MajorProg2\\major-program-2-ChastinT");
        chooser.showSaveDialog(null);
        wareHouse.readMowerData(chooser.getSelectedFile().getName()); 
        if (wareHouse.equals(null))
        {
        wareHouse.readMowerData("input.txt");
        }
           /* WalkBehindMower testBehind = new WalkBehindMower();
            testBehind.setManufacturer("This is adding test");
            testBehind.setYear(1999);
            testBehind.setSerialNumber("Mad Dog546");
         testBehind.setCutWidth(4.6);
         testBehind.setWheelDiameter(20.5);
           testBehind.setManufacturer("FINISH IT");
        testBehind.setYear(1979);
        testBehind.setSerialNumber("COLDFIRE3234");
        wareHouse.addMower(testBehind);
*/
           
    
        wareHouse.saveMowerData("output.txt");
        WareHouseFrame framer = new WareHouseFrame(wareHouse);
        framer.setVisible(true);
        
    }
    
}
