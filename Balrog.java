import java.util.Random;
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // Out to Lunch
    private int hp;
    private int strength;
    Random random = new Random();    
    
    /**
     * Constructor
     */
    public Balrog()
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
    
    /**
     * Inflict Damage/hurt
     */
    public int damage()
    {
        int dam, crit;
        dam = random.nextInt(strength);
        crit = strength * 2;
        int i = random.nextInt()%2;
        if(i == 0) 
        {
            return dam;
        }
        else
        {
            return crit;
        }
    }
}