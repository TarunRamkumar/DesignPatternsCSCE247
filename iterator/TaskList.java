package iterator;
/**
 * List of tasks
 * @author Tarun
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;
    /**
     * Creates a new list of tasks
     * @param name Name of tasklist
     */
    public TaskList(String name)
    {
        if(name != null)
            this.name = name;
        else
            name = "None";
        tickets = new Ticket[100];
        count = 0;
    }
    /**
     * Adds ticket to list
     * @param name Name of ticket
     * @param teamMember Teammember of ticket
     * @param difficulty Difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty)
    {
       for(int i = 0; i < tickets.length; i++)
       {
            if(tickets[i] == null){
                tickets[i] = new Ticket(name, teamMember, difficulty);
                count++;
                return;
            }
       } 
       System.out.println("Error adding ticket: List full");
    }
    /**
     * Adds an existing ticket from another list
     * @param ticket TIcket to add
     */
    public void addTicket(Ticket ticket)
    {
        for(int i = 0; i < tickets.length; i++)
       {
            if(tickets[i] == null){
                tickets[i] = ticket;
                count++;
                return;
            }
       } 
       System.out.println("Error adding ticket: List full");
    }
    /**
     * Gets and removes the ticket from the list
     * @param name Name of ticket
     * @return Returns the ticket from the list
     */
    public Ticket getTicket(String name)
    {

        for(int i = 0; i < tickets.length; i++){
            if(tickets[i] != null && tickets[i].getName().equals(name)){
                Ticket ticket = tickets[i];
                tickets[i] = null;
                return ticket;
            }
        }
        return null;
    }

    /**
     * Creates a new iterator from the list
     * @return The iterator 
     */
    public TaskListIterator createIterator()
    {
        return new TaskListIterator(tickets);
    }
    /**
     * String representation of the tasklist
     */
    public String toString()
    {
        String response = this.name + ": \n";
        for(Ticket t : tickets){
            if(t != null)
                response += t.toString() + "\n";
        }
        return response;
    }

    
}
