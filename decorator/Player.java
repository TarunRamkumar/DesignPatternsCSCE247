package decorator;

import java.util.ArrayList;

public abstract class Player 
{
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name)
    {
        if(name == null)
            this.name = "No name";
        else
            this.name = name;
        this.lines = lines;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        String player = new String();
        for(String s : lines)
            player += s+"\n";
        return player;
    }











}