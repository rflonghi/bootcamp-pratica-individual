package Aula3;

import java.util.ArrayList;
import java.util.List;

public class RadixSort{

    public static void radixSort(int iArr[])
    {
        String sArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++)
            sArr[i] = String.valueOf(iArr[i]);

        int size = 0;
        for (String num : sArr)
        {
            if (num.length() > size)
                size = num.length();
        }
        for (int i = 0; i < sArr.length; i++)
        {
            if (sArr[i].length() < size)
            {
                int limit = size - sArr[i].length();
                for (int j = 0; j < limit; j++)
                    sArr[i] = "0"+sArr[i];
            }
        }

        size--;
        while (size >= 0) {
            List<String> L0 = new ArrayList<>();
            List<String> L1 = new ArrayList<>();
            List<String> L2 = new ArrayList<>();
            List<String> L3 = new ArrayList<>();
            List<String> L4 = new ArrayList<>();
            List<String> L5 = new ArrayList<>();
            List<String> L6 = new ArrayList<>();
            List<String> L7 = new ArrayList<>();
            List<String> L8 = new ArrayList<>();
            List<String> L9 = new ArrayList<>();
            for (String num : sArr) {
                if (num.charAt(size) == '0')
                    L0.add(num);
                else if (num.charAt(size) == '1')
                    L1.add(num);
                else if (num.charAt(size) == '2')
                    L2.add(num);
                else if (num.charAt(size) == '3')
                    L3.add(num);
                else if (num.charAt(size) == '4')
                    L4.add(num);
                else if (num.charAt(size) == '5')
                    L5.add(num);
                else if (num.charAt(size) == '6')
                    L6.add(num);
                else if (num.charAt(size) == '7')
                    L7.add(num);
                else if (num.charAt(size) == '8')
                    L8.add(num);
                else
                    L9.add(num);
            }
            int i = 0;
            for (i = 0; i < L0.size(); i++)
                sArr[i] = L0.get(i);
            for (int j = 0; j < L1.size(); j++, i++)
                sArr[i] = L1.get(j);
            for (int j = 0; j < L2.size(); j++, i++)
                sArr[i] = L2.get(j);
            for (int j = 0; j < L3.size(); j++, i++)
                sArr[i] = L3.get(j);
            for (int j = 0; j < L4.size(); j++, i++)
                sArr[i] = L4.get(j);
            for (int j = 0; j < L5.size(); j++, i++)
                sArr[i] = L5.get(j);
            for (int j = 0; j < L6.size(); j++, i++)
                sArr[i] = L6.get(j);
            for (int j = 0; j < L7.size(); j++, i++)
                sArr[i] = L7.get(j);
            for (int j = 0; j < L8.size(); j++, i++)
                sArr[i] = L8.get(j);
            for (int j = 0; j < L9.size(); j++, i++)
                sArr[i] = L9.get(j);
            size--;
        }
        for (int i = 0; i < sArr.length; i++)
            iArr[i] = Integer.parseInt(sArr[i]);
    }

    public static void main(String[] args)
    {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);
        for (int i : iArr)
        {
            System.out.println(i + " ");
        }
    }
}
