package com.step.converter.TempConverter;

public class TempConverter{

	public void convertToFahr(double celsius)
	{
		double fahr=celsius*1.8+32;

		System.out.println("celsius to fahr = "+fahr);
	}
	public void convertToCelsius(double fahr)
	{
		double celsius=(fahr-32)*5/9;

		System.out.println("Fahr to Celsius = "+celsius);
	}

}