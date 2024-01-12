package strategy;

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
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
