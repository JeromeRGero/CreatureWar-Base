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
    
    
    public Cyberdemon()
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
}