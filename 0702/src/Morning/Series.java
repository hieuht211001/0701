package Morning;

public class Series extends ABook
{
    private String sAuthor;
    private String sSub;
    private int iNum;

    protected String printInfo()
    {
        return String.format("Title %s, Num Of Page %d, Author %s, sSub %s", sTitle, iPageNum, sAuthor, sSub);
    }
}
