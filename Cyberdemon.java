import java.util.Random;
/**
 * Write a description of class Cyberdemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cyberdemon extends Demon
{
    // Out to Lunch
    private int hp;
    private int strength;
    Random random = new Random();    
    
    /**
     * Constructor
     */
    public Cyberdemon()
    {
        super();
        this.strength = strength;
        this.hp = hp;
    }
    
    /**
     * Set Health
     */
    public void setHP()
    {
        hp = random.nextInt(10) + 5;
    }
    
    /**
     * Set Strength
     */
    public void setSTR()
    {
        strength = random.nextInt(15) + 8;
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