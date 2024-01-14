package strategy;
import java.util.Random;
/**
 * A hockey player
 * @author Tarun
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand = new Random();
    /**
     * Creates a new, generic hockey player
     * @param firstName
     * @param lastName
     */
    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    /**
     * Sets the player's defensive behavior
     * @return nothing
     */
    public abstract void setDefenceBehavior();
    /**
     * Sets the player's offensive behavior
     * @return nothing
     */
    public abstract void setOffenceBehavior();
    /**
     * Describes the player's action when playing, depending on if the player has possesion or not
     * @param possesion
     * @return A string representation of the player's action
     */
    public String play(boolean possesion)
    {
        if(possesion)
            return offenceBehavior.play();
        
            return defenceBehavior.play();
    }
    /**
     * Creates a description of the player
     * @return A string description of the player's name
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
