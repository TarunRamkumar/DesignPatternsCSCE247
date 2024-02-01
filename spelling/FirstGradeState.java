package spelling;

public class FirstGradeState extends State {
    
    public FirstGradeState(SpellingList spellingList)
    {
        super(FileReader.getWords("first.txt"));
    }

    public void increaseGrade()
    {
        
    }

    public void decreaseGrade()
    {

    }
}
