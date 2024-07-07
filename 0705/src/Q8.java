import java.util.HashMap;
import java.util.Map;

public class Q8
{
    public void doAction()
    {
        InputHashMap inputHashMap1 = new InputHashMap();
        inputHashMap1.setsStoppedText("order");
        inputHashMap1.GetValue();
        InputHashMap inputHashMap2 = new InputHashMap();
        inputHashMap2.setsStoppedText("done");
        inputHashMap2.GetValue();

        int iTotalBill = 0;
        for (String key : inputHashMap2.inputArray.keySet())
        {
            try
            {
                int iPriceOfCurrentMeal = Integer.parseInt(inputHashMap1.inputArray.get(key));
                int iNumOfOrder = Integer.parseInt(inputHashMap2.inputArray.get(key));
                iTotalBill += iPriceOfCurrentMeal * iNumOfOrder;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid Meal");
            }

        }
        System.out.println(iTotalBill);
    }
}
