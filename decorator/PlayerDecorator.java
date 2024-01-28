package decorator;
import java.util.ArrayList;
import java.lang.StringBuffer;
public abstract class PlayerDecorator extends Player {
    private Player player;

    public PlayerDecorator(Player player)
    {
        super(player.lines, player.name);
        this.player = player;
    }

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
                }
                lines.set(i,new String(newline));
            }
        }
    }
}
