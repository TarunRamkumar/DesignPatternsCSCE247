package decorator;
import java.util.ArrayList;
import java.lang.StringBuffer;
/**
 * Adds decorations to the player
 * @author Tarun
 */
public abstract class PlayerDecorator extends Player {
    private Player player;
    /**
     * Creates a new player decorator
     * @param player The player the decorations should be applie to 
     */
    public PlayerDecorator(Player player)
    {
        super(player.lines, player.name);
        this.player = player;
    }
    /**
     * Given the decorations, overlays the decorations onto the exisiting player, "decorating" it. 
     * @param decor An ArrayList of Strings that provides the string representation of the decorations. 
     */
    protected void integrateDecor(ArrayList<String> decor)
    {
        for(int i = 0; i < lines.size(); i++)
        {
            if(!lines.get(i).equals(decor.get(i)))
            {
                int linesLength = lines.get(i).length();
                int decorLength = decor.get(i).length();
                int size = Math.max(linesLength, decorLength);

                StringBuffer newline = new StringBuffer(lines.get(i)), decorline = new StringBuffer(decor.get(i));

                newline.setLength(size);
                decorline.setLength(size);
                
                for(int j = 0; j < size; j++)
                {
                    if(newline.charAt(j) != decorline.charAt(j) && !Character.isWhitespace(decorline.charAt(j)) && decorline.charAt(j) != 0)
                    {
                        newline.setCharAt(j,decorline.charAt(j));
                    }    
                    if(newline.charAt(j) == 0)
                        newline.setCharAt(j,' ');
                }
                lines.set(i,new String(newline));
            }
        }
    }
}
