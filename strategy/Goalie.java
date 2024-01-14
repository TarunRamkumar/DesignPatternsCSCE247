package strategy;
/**
 * A player that is a Goalie
 * @author Tarun
 */
public class Goalie extends Player {
    /**
     * Creates a new Goalie
     * @param firstname
     * @param lastName
     */
    public Goalie(String firstname, String lastName)
    {
        super(firstname, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }
    /**
     * Sets the offense behavior to blocking the goal
     */
    public void setOffenceBehavior()
    {
        offenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Sets the defensive behavior to blocking the goal 
     */
    public void setDefenceBehavior()
    {
        defenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Creates a string representation of the goalie
     * @return A string describing the Goalie
     */
    public String toString()
    {
        return super.toString() + " plays the position: Goalie";
    }
}
