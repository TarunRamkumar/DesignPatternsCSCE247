package strategy;
/**
 * The behavior players have whilst blocking goals. Implements both Offence and Defence behavior. 
 * @author Tarun
 */
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
    /**
     * Implements the play() method from both OffenceBehavior and DefenceBehavior. Chooses randomly from a list of String representations representing a player's actions. 
     * @return A string representation of the player's block goal action
     */
    public String play()
    {
        switch((int)Math.floor(Math.random() * 4)) {
            default:
            return null;
            case 0: 
            return "hand blocks the puck";
            
            case 1:
            return "catches the puck";
    
            case 2: 
            return "blocks puck with knee pads";

            case 3:
            return "blocks puck with stick";
            }
    }
}
