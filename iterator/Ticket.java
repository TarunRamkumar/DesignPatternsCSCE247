package iterator;
/**
 * Ticket task
 */
public class Ticket {
    String name;
    String teamMember;
    int difficulty;
    /**
     * Ticket to create
     * @param name Name of task
     * @param teamMember Teammember doing it
     * @param difficulty Diffculty of task
     */
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
    /**
     * Gets the name of the task
     * @return String representation of the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Returns a string representation of the task
     */
    public String toString()
    {
        return this.name + "(" + this.difficulty + ") - " + this.teamMember;
    }
}
