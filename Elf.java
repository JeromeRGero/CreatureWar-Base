import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private int hp;
    private int strength;
    Random random = new Random();
    
    /**
     * Constructor for objects of class Human
     */
    public Elf()
    {
        // initialise instance variables
        super();
        this.strength = random.nextInt(5) + 5;
        this.hp = random.nextInt(15) + 5;
    }
    
    public void setHP()
    {
        hp = random.nextInt(15) + 5;
    }
    
    public void setSTR()
    {
        strength = random.nextInt(5) + 5;
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
       int crit= rand.nextInt(10)+1;
       if(crit==10)
       {
           damage=damage*2;
       }
       return damage;
    }
}
