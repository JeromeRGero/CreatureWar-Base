import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (Jerome Gero the "I am not getting a good grade in this class.") 
 * @version (Beta Max or VHS Tape)
 */
public class Creature
{
   private int hp;
   private int strength;
   
  /**
   * Constructor
   * Defult hp and strength set to 10 pts.
   **/
  public Creature(){
       hp = 10;
       strength = 10;
   }
  
  /**
  * Method used to get Damage through getHurt
  */
  public int damage()
  {
       //Bone-Saw is Ready
       int Pain;
       Random random = new Random();
       Pain = (random.nextInt(strength) + 1);
       
       return Pain;
  }
  
  /**
  *Method used to inflict Pain
  */
  public void getHurt(int damage)
  {
      hp= hp-damage;
  }
  
  /**
  * Check Health
  */
  public int getHP()
  {
      return hp;           
  }
  
  /**
  * Check Strength
  */
  public int getSTR()
  {
      return strength;           
  }     
}
