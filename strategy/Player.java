package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    private abstract DefenceBehavior defenceBehavior;
    private abstract OffenceBehavior offenceBehavior;
    private abstract Random rand;

    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }



}
