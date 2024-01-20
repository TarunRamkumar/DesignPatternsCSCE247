package strategy;
/**
 * The behavior players have whilst chasing the puck. 
 * @author Tarun
 */
public class ChasePuckBehavior implements DefenceBehavior{
    /**
     * String representation of the player's behavior whilst chasing the puck. 
     * @return A String representation of a player's chase puck action.
     */
    public String play()
    {
        return "chases the puck";
    }
}
