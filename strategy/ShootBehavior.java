package strategy;
/**
 * The behavior players have whilst shooting on offence. 
 * @author Tarun
 */
public class ShootBehavior implements OffenceBehavior {
    /**
     * Describes the player's action while shooting
     * @return A string description of a shot
     */
    public String play()
    {
        return "Shoots at the goal";
    }
}
