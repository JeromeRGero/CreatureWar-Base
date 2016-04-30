import java.util.Random;
import java.util.ArrayList;
/**
 * It is Good for Absolutely Nothing.
 * 
 * @author (JEROME) 
 * @version (Beta Max or VHS)
 */
public class War
{
    // instance variables - replace the example below with your own
    Creature creature = new Creature();
    Human human = new Human();
    Random random = new Random();
    Cyberdemon cyber = new Cyberdemon();
    Balrog balrog = new Balrog();
    Elf elf = new Elf();
    private ArrayList<Creature> Goodguys;
    private ArrayList<Creature> Badguys;

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        
        super();
        this.Goodguys = new ArrayList<Creature> ();
        this.Badguys = new ArrayList<Creature> ();
        
    }

    /**
     * No re
     */
    public void getGud()
    {
        int chip;
        int i;
        for(i = 0; i < 20; ++i)
        {
            chip = random.nextInt(2) + 1;
            if(chip == 1)
            {
                //elf.create();
                Goodguys.add(elf = new Elf());
            }
            else
            {
                //human.create();
                Goodguys.add(human = new Human());
            }
        }
    }
    
    public void getBad()
    {
        int chip;
        int i;
        for(i = 0; i < 20; ++i)
        {
            chip = random.nextInt(2) + 1;
            if(chip == 1)
            {
                //elf.create();
                Badguys.add(cyber = new Cyberdemon());
            }
            else
            {
                //human.create();
                Badguys.add(balrog = new Balrog());
            }
        }
    }
    
    public void PlayLaunch()
    {
        int GG, BG;
        GG = 0;
        BG = 0; 
        
        getGud();
        getBad();
        
        System.out.println("If we cannot have your precious pudding cups, then we will have WAR!!!");
        while( GG < Goodguys.size() && BG < Badguys.size())
        {
       
            Goodguys.get(GG).getHurt(Badguys.get(BG).damage());
            Badguys.get(BG).getHurt(Goodguys.get(GG).damage());
            
            if(Goodguys.get(GG).getHP()<0 && Badguys.get(BG).getHP()<0)
            {
                GG++; 
                BG++;
                System.out.println("Both creatures died!");
            }
            else if(Goodguys.get(GG).getHP()<0)
            {
                GG++;
                System.out.println("A creature from Team One died");
            }
            else if(Badguys.get(BG).getHP()<0)
            {
                BG++;
                System.out.println("A creature from Team Two died");
            }
        }
    
        String result=""; 
        System.out.println("Team One Casualties: "+GG);
        System.out.println("Team Two Casualties: "+BG);  
        if(GG < 21 && BG < 21)
            result="Nobody!";
        if(GG < 21)
            result="Team Two!";
        if(BG < 21)
            result="Team One!" ;       
        System.out.println("And the winner is...." + result);
    
    }
}
