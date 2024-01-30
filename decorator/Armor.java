package decorator;

/**
 * Armor for the player
 * @author Tarun
 */
public class Armor extends PlayerDecorator {
    /**
     * Creates a new decoration that takes input from the armor file. 
     * @param player The player the decoration should be applied to 
     */
    public Armor(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("decorator\\armor.txt"));
    }
}
