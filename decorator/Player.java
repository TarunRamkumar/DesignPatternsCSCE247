package decorator;

import java.util.ArrayList;

public class Player 
{
    private String name;
    private ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name)
    {
        if(name == null)
            this.name = "No name"
        else
            this.name = name;
        this.lines = new ArrayList<String>().addAll(lines);
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return 
    }











}