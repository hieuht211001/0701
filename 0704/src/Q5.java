import java.util.*;

public class Q5 extends InputArray implements doAction
{

    @Override
    public void doAction()
    {
        GetValue();
        Set<String> ConvertedSet = new TreeSet<String>();
        List<String> ConvertedList = new ArrayList<String>();
        for (String sInput : inputArray)
        {
            ConvertedSet.add(sInput);
        }
        for (String s : ConvertedSet)
        {
            ConvertedList.add(s);
        }
        Collections.sort(ConvertedList);
        System.out.println(ConvertedList);
    }
}
