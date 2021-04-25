package com.step.calculator.Calculator;
public class Calculator{

	public void Adunare(int a, int b)
	{
		System.out.printf("a=%d b=%d \n",a,b);
		System.out.println("Suma a+b = "+(a+b));
	}
	public void Scadere(int a, int b)
	{
		System.out.println("scadere a-b = "+(a-b));
	}
	public void Inmultire(int a, int b)
	{
		System.out.println("Inmultire a*b = "+(a*b));
	}
	public void Impartire(int a,int b)
	{
		System.out.println("Inpartire a/b = "+(a/b));
	}
}