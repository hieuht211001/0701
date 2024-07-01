public class Student extends Person
{
    private String sMajor;
    private String sScore;

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }

    public String getsScore() {
        return sScore;
    }

    public void setsScore(String sScore) {
        this.sScore = sScore;
    }

    public void printInfo()
    {
        System.out.println(String.format("%s - %s (%s)", this.getName(), this.sMajor, this.sScore));
    }
}
