package strategy;

public class Goalie extends Player {
    
    public Goalie(String firstname, String lastName)
    {
        super(firstname, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    public void setOffenceBehavior()
    {
        offenceBehavior = new BlockGoalBehavior();
    }

    public void setDefenceBehavior()
    {
        defenceBehavior = new BlockGoalBehavior();
    }

    public String toString()
    {
        return super.toString() + " plays the position: Goalie";
    }
}
