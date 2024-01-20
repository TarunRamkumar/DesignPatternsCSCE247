package strategy;
/**
 * The behavior players have whilst passing on offense. 
 * @author Tarun
 */
public class PassBehavior implements OffenceBehavior {
    /**
     * Describes the player's pass behavior
     * @return A string representation of a pass
     */
    public String play()
    {
        return "Passes to a forward";
    }
}
