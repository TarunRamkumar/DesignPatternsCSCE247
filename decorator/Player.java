package decorator;

import java.util.ArrayList;
/**
 * The player to be decorated  
 * @author 
 */
public abstract class Player 
{
    protected String name;
    protected ArrayList<String> lines;
    /**
     * Creates a new player 
     * @param lines The lines that provide the string representation of the player
     * @param name The name of the player
     */
    public Player(ArrayList<String> lines, String name)
    {
        if(name == null)
            this.name = "No name";
        else
            this.name = name;
        this.lines = lines;
    }
    /**
     * Gets the string representation of the players name
     * @return A string representing the player's name 
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Prints out the player
     * @return A string representation of the player, including any decorations.
     */
    public String toString()
    {
        String player = new String(); 
        for(String s : lines)
            player += s+"\n";
        return player;
    }











}