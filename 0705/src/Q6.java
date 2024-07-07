import java.util.Scanner;

public class Q6 extends InputHashMap
{
    public void doAction()
    {
        setsStoppedText("order");
        GetValue();
        Scanner sc = new Scanner(System.in);
        String inputMenu = sc.nextLine();
        try
        {
            String sPrice = inputArray.get(inputMenu);
            System.out.println(sPrice);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }

    }
}
