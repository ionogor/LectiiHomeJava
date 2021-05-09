package com.step.ArrayMax;

import java.util.Scanner;

public class Max {

    public static int maxElement(int [] arr)
    {
        int max=0;

        for (int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

}
