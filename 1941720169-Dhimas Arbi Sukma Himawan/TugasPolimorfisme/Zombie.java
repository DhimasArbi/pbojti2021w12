package TugasPolimorfisme;

/**
 *
 * @author dhimas
 */
public class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){    }
    
    @Override
    public void destroyed(){    }
    
    public String getZombieInfo(){
        String info = "Health = "+health+"\n"+
                "Level = "+level+"\n";
        return info;
    }
}
