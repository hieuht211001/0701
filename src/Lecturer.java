public class Lecturer extends Person
{
    private String sMajor;
    private int iNumberOfDoc;

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }

    public int getiNumberOfDoc() {
        return iNumberOfDoc;
    }

    public void setiNumberOfDoc(int iNumberOfDoc) {
        this.iNumberOfDoc = iNumberOfDoc;
    }

    public void printInfo()
    {
        System.out.println(String.format("%s (강사) - %s", this.getName(), this.sMajor));
    }
}
