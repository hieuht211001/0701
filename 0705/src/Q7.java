import java.util.HashSet;
import java.util.Set;

public class Q7 extends InputHashMap
{
    public void doAction()
    {
        setsStoppedText("q");
        GetValue();
        Set<String> sMajorSet = new HashSet<String>();
        for (String key : inputArray.keySet())
        {
            sMajorSet.add(key);
        }
        String sOutputText = "";
        for (String field : sMajorSet)
        {
            sOutputText += field;
            for (String key : inputArray.keySet())
            {
                if (field.equals(key))
                {
                    sOutputText += " " + inputArray.get(key);
                }
            }
            sOutputText += "\n";
        }
        System.out.println(sOutputText);
    }
}
