package strategy;
/**
 * The behavior players have whilst blocking
 * @author Tarun
 */
public class BlockBehavior implements DefenceBehavior{
    /**
     * Implements the play() method from DefenceBehavior by randomly choosing a string representation of a player's action. 
     * @return A string representation of a player's blocking action
     */
    public String play()
    {
        switch((int)Math.floor(Math.random() * 3)) {
        default:
        return null;
        case 0: 
        return "blocks player from passing";
        
        case 1:
        return "blocks player from shooting";

        case 2: 
        return "checks player with puck";
        
        }
        
    }

}
