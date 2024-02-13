package iterator;
import java.util.Iterator;

public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets)
    {
        this.tickets = tickets;
        position = 0;
    }

    public boolean hasNext()
    {
        if(tickets[position+1] != null)
            return true;
        else
            return false;
    }

    public Ticket next()
    {
        position++;
        return tickets[position];
    }
}
