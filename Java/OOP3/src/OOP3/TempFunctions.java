package OOP3;

import java.text.DecimalFormat;

/**
 * 
 * @author Micheal Cini
 *
 */

//Create Private Variables
public class TempFunctions 
{ 
	private double celsius;
	private double fahrenheit;
 
	//Constructor
	public TempFunctions() 
	{ 
		this.celsius=0;
		this.fahrenheit=0;
	}

	// Constructor that receives input
	public TempFunctions(double celsius, double fahrenheit) 
	{ 
		this.celsius = Double.parseDouble(formatDecimal(celsius));
		this.fahrenheit = Double.parseDouble(formatDecimal(fahrenheit));
		
	}
	
	/**
	 * 
	 * @return
	 */

	//Getter for getting Celsius
	public double getCelsius() 
	{ 
		return celsius;
	}

  //Setter for setting Celsius
	public void setCelsius(double celsius) 
	{ 
		this.celsius = Double.parseDouble(formatDecimal(celsius));
	}

	//Getter for getting Fahrenheit
	public double getFahrenheit() 
	{
		return fahrenheit;
	}

	//Setter for setting Fahrenheit
	public void setFahrenheit(double fahrenheit) 
	{
		this.fahrenheit = Double.parseDouble(formatDecimal(fahrenheit));
	}
	
	//Method for converting celcius to fahrenheit
	public void toCelsius(double fahrenheit) 
	{
		this.celsius = (fahrenheit -32) / 1.8;
	}
	
	//Method for converting fahrenheit to celsius
	public void toFahrenheit(double celsius) 
	{
		this.fahrenheit = (celsius *1.8) + 32;
	}
	
	
	//Method for decimal format
	public String formatDecimal(double input) 
	{
		DecimalFormat dec = new DecimalFormat("###.###");
		return dec.format(input);
	}

	public String toStringTemperature() 
	{
		return "Celsius: " + celsius + "°\nFahrenheit: " + fahrenheit + "°";
	}
	
	
	
	

}
