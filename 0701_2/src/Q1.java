import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Q1
{
    public static int TimeDisplay()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNum = sc.nextInt();
        if (iInputNum > 127 || iInputNum <0)
        {
            return -1;
        }
        else if (iInputNum == 12 -7 || iInputNum == 24 - 7)
        {
            return 0;
        }
        else
        {
            return (iInputNum + 7) % 12;
        }
    }

    public static String Return()
    {
        Scanner sc = new Scanner(System.in);
        int iInputNumTotal = 0;
        iInputNumTotal = sc.nextInt();
        int[] iInputArr = new int[iInputNumTotal];
        for (int i = 0; i < iInputNumTotal; i++)
        {
            iInputArr[i] = sc.nextInt();
        }

        String sField= "";
        for (int i = iInputNumTotal - 1; i >= 0; i--)
        {
            sField += (String.format("%s, ",iInputArr[i]));
        }
        return sField;
    }

    public static String KeyEncoder()
    {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Character> my_dict = new Hashtable<Integer, Character>();
        int iIndex = 0;
        for (char Text = 'A'; Text <= 'Z'; Text++)
        {
            my_dict.put(iIndex, Text);
            iIndex++;
        }
        int iKey = sc.nextInt();
        sc.nextLine();
        String sInputText = sc.nextLine();
        String cEncodedString = "";
        for (int i = 0; i < sInputText.length(); i++)
        {
            Character ch = sInputText.charAt(i);
            int iKeyInDic = 0;
            for (Map.Entry<Integer, Character> entry : my_dict.entrySet()) {
                if (entry.getValue().equals(ch))
                {
                    iKeyInDic = entry.getKey();
                    break;
                }
            }
            int iNewNum = 0;
            if (iKeyInDic - iKey >= 0)
            {
                iNewNum =  Math.abs(iKeyInDic - iKey) % 26;
            }
            else
            {
                iNewNum =  Math.abs(iKeyInDic - iKey + 26) % 26;
            }
            Character cEncodedStringField = my_dict.get(iNewNum);
            cEncodedString += cEncodedStringField;
        }
        return cEncodedString;
    }
}
