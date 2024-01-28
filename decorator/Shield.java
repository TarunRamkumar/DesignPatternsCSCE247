package decorator;
/**
 * Creates a player decorator that is a shield
 * @author Tarun
 */
public class Shield extends PlayerDecorator {
    /**
     * Creates a new shield decoration
     * @param player The player the shield should be added to
     */
    public Shield(Player player)
    {
        super(player);
        integrateDecor(FileReader.getLines("decorator\\shield.txt"));
    }
}
