package com.step.FindCh;

import java.util.Scanner;

public class FIndCh {

    char[] vocale=new char[]{'a', 'e', 'i', 'o','u', 'ă', 'î'};
    char[] symbol=new char[7];

   public  void FindCh()
    {
        Scanner sc=new Scanner(System.in);

        String r;

        for (int i=0;i<vocale.length;i++)
        {
               symbol[i]=sc.next().charAt(0);

             r=vocale[i] == symbol[i] ? " Este vocala" : " Este consoana";

            System.out.println(symbol[i]+r);
        }
    }

}
