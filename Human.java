import java.util.Random;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random random = new Random();
    
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // initialise instance variables
        super();
        this.strength = random.nextInt(13) + 6;
        this.hp = random.nextInt(25) + 6;
    }
    
    /**
     * set Health
     */
    public void setHP()
    {
        hp = random.nextInt(25) + 6;
    }
    
    /**
     * set Strength
     */
    public void setSTR()
    {
        strength = random.nextInt(13) + 6;
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
