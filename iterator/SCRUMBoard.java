package iterator;
/**
 * Creates a SCRUMboard
 * @author Tarun
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;
    /**
     * Creates a scrumboard obkect
     * @param projectName Name of project
     */
    public SCRUMBoard(String projectName)
    {
        this.projectName = projectName;
        todo = new TaskList("todo");
        
        doing = new TaskList("doing");

        done = new TaskList("done");
    }
    /**
     * Adds a ticket to the todo list
     * @param name Name of ticket
     * @param teamMember Member
     * @param difficulty Difficulty of task
     */
    public void addTicket(String name, String teamMember, int difficulty)
    {
        todo.addTicket(new Ticket(name, teamMember, difficulty));
    }
    /**
     * Moves ticket to doing
     * @param name Name of ticket
     * @return True if the ticket was added.
     */
    public boolean startTicket(String name)
    {
        Ticket ticket = todo.getTicket(name);
        if(ticket == null)
            return false;
        doing.addTicket(ticket);
            return true;
        
    }
    /**
     * Moves ticket to done
     * @param name Name of ticket
     * @return True if ticket was moved
     */
    public boolean finishTicket(String name)
    {
        Ticket ticket = doing.getTicket(name);
        if(ticket == null)
            return false;
        done.addTicket(ticket);
        return true;
    }
    /**
     * Returns string representation of ticket
     */
    public String toString()
    {
        return todo + "\n" + 
        doing + "\n" + 
        done;
    }

}
