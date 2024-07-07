import java.util.Set;
import java.util.TreeSet;

public class Q4 extends InputArray implements doAction
{

    @Override
    public void doAction()
    {
        GetValue();
        int iTempValue = 0;
        int iTotal = 0;
        int iNumOfInt = 0;
        Set<Integer> ConvertedSet = new TreeSet<Integer>();
        for (String sInput : inputArray)
        {
            try
            {
                iTempValue = Integer.parseInt(sInput);
                ConvertedSet.add(iTempValue);
            } catch (NumberFormatException e)
            {
                iTempValue = 0;
            }
        }

        for (int iInputInt : ConvertedSet)
        {
            iTotal += iInputInt;
            iNumOfInt ++;
        }
        System.out.println(iNumOfInt);
        System.out.println(iTotal);
    }
}
