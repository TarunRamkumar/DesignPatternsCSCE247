package strategy;
/**
 * A defensive player
 * @author Tarun
 */
public class Defenceman extends Player {
    /**
     * Constructs a new Defensive player
     * @param firstname
     * @param lastName
     */
    public Defenceman(String firstname, String lastName)
    {
        super(firstname, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
        
    }
    /**
     * Sets the player's offensive behavior, with a 90% chance of it being a pass, and a 10% chance of being a slapshot. 
     * @return nothing
     */
    public void setOffenceBehavior()
    {
        if(rand.nextInt(100) >= 90 )
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new SlapShotBehavior();
    }
    /**
     * Sets the player's defensive behavior, randomly selecting between chasing the puck and blocking. 
     * @return nothing
     */
    public void setDefenceBehavior()
    {
        if(rand.nextInt(2) == 1)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }
    /**
     * Creates a string representation of the defensive player
     * @return A string representation of a Defenceman
     */
    public String toString()
    {
        return super.toString() + " plays the position: Defenceman";
    }
}
