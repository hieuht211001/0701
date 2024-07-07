import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputArray
{
    protected List<String> inputArray = new ArrayList<String>();

    public void GetValue()
    {
        String sInputValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your array:");
        while (true)
        {
            sInputValue = sc.nextLine();
            if (sInputValue.equals("q")) {return;}
            inputArray.add(sInputValue);
        }
    }
}
