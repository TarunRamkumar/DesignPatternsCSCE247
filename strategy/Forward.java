package strategy;

public class Forward extends Player {
    
    public Forward(String firstname, String lastName)
    {
        super(firstname, lastName);
        setOffenceBehavior();
        setDefenceBehavior();

    }

    public void setOffenceBehavior()
    {
        if(rand.nextInt(2) == 1)
            offenceBehavior = new PassBehavior();
        else
            offenceBehavior = new ShootBehavior();
    }

    public void setDefenceBehavior()
    {
        if(rand.nextInt(2) == 1)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    public String toString()
    {
        return super.toString() + " plays the position: Forward";
    }
}
