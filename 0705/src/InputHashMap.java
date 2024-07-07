import java.util.*;

public class InputHashMap
{
    public String sStoppedText = "";
    protected Map<String, String> inputArray = new HashMap<String, String>();

    public void setsStoppedText(String sStoppedText)
    {
        this.sStoppedText = sStoppedText;
    }

    public void GetValue()
    {
        String sInputValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your menu:");
        while (true)
        {
            sInputValue = sc.nextLine();
            if (stopInputByText(sInputValue)) break;
            try
            {
                String[] sSeparatedInputArray = sInputValue.split(" ");
                inputArray.put(sSeparatedInputArray[0], sSeparatedInputArray[1]);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    public boolean stopInputByText(String sCurrentText)
    {
        if (sCurrentText.equals(sStoppedText)) return true;
        return false;
    }
}
