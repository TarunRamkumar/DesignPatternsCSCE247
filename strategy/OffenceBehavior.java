package strategy;
/**
 * Interface for a player's offensive behavior. 
 * @author Tarun
 */
public interface OffenceBehavior {
    /**
     * A player's action during a game. 
     * @return A String representating a player's action
     */
    public String play();
}