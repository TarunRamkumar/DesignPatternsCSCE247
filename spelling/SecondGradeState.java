package spelling;

public class SecondGradeState extends State {
    
    public SecondGradeState(SpellingList spellingList)
    {
        super(FileReader.getWords("second.txt"));
    }

    public void increaseGrade()
    {

    }

    public void decreaseGrade()
    {
        
    }
}
