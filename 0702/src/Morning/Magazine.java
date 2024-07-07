package Morning;

public class Magazine extends ABook
{
    private int iDate;
    private int iSubject;
    protected String printInfo()
    {
        return String.format("Title %s, Num Of Page %d, Date %d, Subject %s", sTitle, iPageNum, iDate, iSubject);
    }
}