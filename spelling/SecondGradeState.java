package spelling;

public class SecondGradeState extends State {
    
    public SecondGradeState(SpellingList spellingList)
    {
        super(spellingList);
        this.words = FileReader.getWords("spelling\\second.txt");
    }

    public void increaseGrade()
    {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    public void decreaseGrade()
    {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
