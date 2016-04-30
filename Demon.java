import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random random = new Random();
    
    /**
     * Constructor for objects of class Human
     */
    public Demon()
    {
        // initialise instance variables
        super();
        this.strength = strength;
        this.hp = hp;
    }
    
    public void setHP()
    {
        hp = random.nextInt(10) + 5;
    }
    
    public void setSTR()
    {
        strength = random.nextInt(15) + 8;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public int getSTR()
    {
        return strength;
    }
    
    public int damage()
    {
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       int crit= rand.nextInt(100)+1;
       if(crit==5)
       {
           damage=damage+50;
       }
       return damage;
    }
}
