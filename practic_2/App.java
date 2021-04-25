package com.step.Calculator.App;
import com.step.calculator.Calculator.Calculator;
public class App{
	public static void main(String[] args) {
		
		int a=10;
		int b=2;

		Calculator calc=new Calculator();
		
		calc.Adunare(a,b);
		calc.Scadere(a,b);
		calc.Inmultire(a,b);
		calc.Impartire(a,b);



	}
}