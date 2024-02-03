package spelling;

public class ThirdGradeState extends State {
    
    public ThirdGradeState(SpellingList spellingList)
    {
        super(spellingList);
        this.words = FileReader.getWords("spelling\\third.txt");
    }

    public void increaseGrade()
    {
        System.out.println("Sorry, you are already at the highest level. Cannot increase further.");
    }

    public void decreaseGrade()
    {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
