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
public class LawnTractor extends Mower 
{
    private Engine engine;
    private String model;
    private double deckWidth;
    
  public LawnTractor()
  {
      engine = null;
      model = "";
      deckWidth = 0.0;
  }
  
     public void setEngine(Engine enter)
      {
          engine = enter;
      }
      
      public Engine getEngine()
      {
          return engine;
      }
      
       public void setModel(String enter)
      {
         model = enter;
      }
      
      public String getModel()
      {
          return model;
      }
      
      public void setDeckWidth(double enter)
      {
         deckWidth = enter;
      }
      
      public double getDeckWidth()
      {
          return deckWidth;
      }
      
      public String toString()
      {
          return super.toString()+"L"+"\n"+engine+"\n"+model+"\n"+deckWidth+"\n";
      }
}
