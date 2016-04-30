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
    
  public int damage()
  {
       //Bone-Saw is Ready
       int Pain;
       Random random = new Random();
       Pain = (random.nextInt(strength) + 1);
       
       return Pain;
  }
  
  public void getHurt(int damage)
  {
      hp= hp-damage;
  }
  
  public int getHP()
  {
      return hp;           
  }
  
  public int getSTR()
  {
      return strength;           
  }     
}
