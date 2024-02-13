package iterator;

public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName)
    {
        this.projectName = projectName;
        todo = new TaskList("todo");
        
        doing = new TaskList("todo");

        done = new TaskList("todo");
    }

    public void addTicket(String name, String teamMember, int difficulty)
    {
        todo.addTicket(new Ticket(name, teamMember, difficulty));
    }

    public boolean startTicket(String name)
    {
        
    }
}
