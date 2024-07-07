import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Q2 extends InputArray implements doAction
{
    public void doAction()
    {
        GetValue();
        int iTempValue;
        int iTotal = 0;
        for (String sInput : inputArray)
        {
            iTempValue=Integer.parseInt(sInput);
            if (iTempValue % 3 == 0)
            { iTotal += iTempValue;}
        }
        System.out.println(iTotal);
    }
}
