package com.step;

import com.step.ArrayMax.Max;
import com.step.ArraySum.SumArray;
import com.step.Calculator.CalculatorJava;
import com.step.FindCh.FIndCh;
import com.step.ReverseArray.Reverse;

public class Main {

    public static void main(String[] args) {

      int [] arr=new int[5];

        SumArray sum=new SumArray();

        // Sum Array
        System.out.println("SumArray="+sum.SumArr(arr) );

        //Reverse Array
        System.out.println("Reverse array");

        Reverse.Reverse(arr);

        // Max element array
        System.out.println("Max element array is "+ Max.maxElement(arr));

        // Consoana sau vocala

        FIndCh fIndCh=new FIndCh();

        fIndCh.FindCh();

        //Calulator Java

        CalculatorJava calc=new CalculatorJava();

        calc.Adunare(5,3);
        calc.Impartire(10,3);
        calc.Inmultire(7,25);
        calc.Scadere(150,35);

    }
}
