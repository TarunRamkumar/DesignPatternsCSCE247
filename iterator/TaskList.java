package iterator;

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name)
    {
        if(name != null)
            this.name = name;
        else
            name = "None";
        tickets = new Ticket[100];
        count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty)
    {
        tickets[count] = new Ticket(name, teamMember, difficulty);
        count++;
    }

    public void addTicket(Ticket ticket)
    {
        tickets[count] = ticket;
        count++;
    }

    public Ticket getTicket(String name)
    {
        for(Ticket t : tickets)
            if(t.name.equals(name))
                return t;

        return null;
    }

    public TaskListIterator createIterator()
    {
        return new TaskListIterator(tickets);
    }

    public String toString()
    {
        
    }
}
