package iterator;

public class Ticket {
    String name;
    String teamMember;
    int difficulty;

    public Ticket(String name, String teamMember, int difficulty)
    {
        if(name != null)
            this.name = name;
        else
            name = "None";
        if(teamMember != null)
            this.teamMember = teamMember;
        else
            teamMember = "None";
        this.difficulty = difficulty;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        
    }
}
