package strategy;
/**
 * A forward player
 * @author Tarun
 */
public class Forward extends Player {
    /**
     * Creates a new offensive forward player
     * @param firstname
     * @param lastName
     */
    public Forward(String firstname, String lastName)
    {
        super(firstname, lastName);
        setOffenceBehavior();
        setDefenceBehavior();

    }
    /**
     * Randomly sets the player's offensive behavior between passing and shooting.
     * @return nothing
     */
    public void setOffenceBehavior()
    {
        if(rand.nextInt(2) == 1)
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new ShootBehavior();
    }
    /**
     * Randomly sets the player's defensive behavior between chasing the puck and blocking.
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
     * Creates a string representation of a Forward
     * @return A string describing the forward
     */
    public String toString()
    {
        return super.toString() + " plays the position: Forward";
    }
}
