package decorator;
import java.util.ArrayList;
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
                char[] newline = lines.get(i).toCharArray();
                for(int j = 0; j < newline.length; j++)
                {
                    if(newline[j] != decor.get(i).charAt(j))
                        newline[j] = decor.get(i).charAt(j);
                }
                lines.set(i,newline.toString());
            }
        }
    }
}
