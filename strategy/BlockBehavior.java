package strategy;

public class BlockBehavior implements DefenceBehavior{
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
