package decorator;
/**
 * A sword player decoration
 * @author Tarun
 */
public class Sword extends PlayerDecorator {
    /**
     * Creates a new player decoration that is a sword
     * @param player The player the sword should be applied to 
     */
    public Sword(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("decorator\\sword.txt"));
    }
}
