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
    
    
    public Balrog()
    {
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