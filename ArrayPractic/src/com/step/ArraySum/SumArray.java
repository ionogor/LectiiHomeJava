package com.step.ArraySum;

import java.util.Scanner;

public class SumArray {


    public  int  SumArr(int []arr)
    {
        int sumArr=0;
        System.out.println("Please enter number of array");
        for (int i =0;i<arr.length;i++)
        {
            Scanner scann=new Scanner(System.in);
            arr[i]=scann.nextInt();
            sumArr+=arr[i];
        }
        return sumArr;
    }

}
