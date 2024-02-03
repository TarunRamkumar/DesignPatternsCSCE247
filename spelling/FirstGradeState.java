package spelling;

public class FirstGradeState extends State {
    
    public FirstGradeState(SpellingList spellingList)
    {

        super(spellingList);
        this.words = FileReader.getWords("spelling\\first.txt");
    }

    public void increaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    public void decreaseGrade()
    {
        System.out.println("Sorry, you are already at the lowest level. Cannot decrease further.");
    }
}
