package com.step.converter.App;

import com.step.converter.TempConverter.TempConverter;

public class App{

	public static void main(String[] args) {
		
		TempConverter tempconverter=new TempConverter();

		tempconverter.convertToFahr(100);
		tempconverter.convertToCelsius(100);
	}
}