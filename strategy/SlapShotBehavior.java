package strategy;
/**
 * The behavior players have whilst slap shotting on offence
 * @author Tarun
 */
public class SlapShotBehavior implements OffenceBehavior {
    /**
     * Describes the player's action while shooting from long range
     * @return A string description of a slapshot
     */
    public String play()
    {
        return "Shoots the puck from the blue line";
    }
}

