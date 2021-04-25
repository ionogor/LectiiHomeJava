package com.step.comparator.NumbersComparator;
public class NumbersComparator
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;

		int max=maxNumber(a,b);
		int min=minNumber(a,b);
		System.out.println(max);
		System.out.println(min);
	}

	public static int maxNumber(int a, int b)
	{
		if (a>b)
		{
			return a;
		}

		return a;
			
	}

	public static int minNumber(int a, int b)
	{
		if (a<b)
		{
			return b;
		}

		return b;
			
	}

	
}

