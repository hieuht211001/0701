public class Q1 extends InputArray implements doAction
{
    public void doAction()
    {
        GetValue();
        for (String sValue : inputArray)
        {
            System.out.println(sValue);
        }
    }
}
