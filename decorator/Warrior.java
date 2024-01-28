package decorator;
/**
 * A player that is a warrior
 * @author Tarun
 */
public class Warrior extends Player {
    /**
     * Creates a new warrior player.
     * @param name The name of the warrior.
     */
    public Warrior(String name)
    {
        super(FileReader.getLines("decorator\\warrior.txt"),name);
        
    }   
}
