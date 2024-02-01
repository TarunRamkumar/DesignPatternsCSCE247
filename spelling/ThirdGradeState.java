package spelling;

public class ThirdGradeState extends State {
    
    public ThirdGradeState(SpellingList spellingList)
    {
        super(FileReader.getWords("third.txt"));
    }

    public void increaseGrade()
    {

    }

    public void decreaseGrade()
    {
        
    }
}
