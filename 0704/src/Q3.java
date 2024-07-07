import java.util.ArrayList;
import java.util.List;

public class Q3 extends InputArray implements doAction
{
    @Override
    public void doAction()
    {
        GetValue();
        int iTempValue = 0;
        int iTotal = 0;
        String sOutputText = "";
        for (String sInput : inputArray)
        {
            try
            {
                iTempValue=Integer.parseInt(sInput);
                sOutputText += String.format("%d + ",iTempValue);
            }
            catch (NumberFormatException e)
            {
                iTempValue=0;
            }
            finally
            {
                iTotal += iTempValue;
            }
        }
        sOutputText += String.format("= %d",iTotal);
        System.out.println(sOutputText);
    }
}
