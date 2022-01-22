package OOPRectange;

import java.text.DecimalFormat;

/**
 * 
 * @author Micheal Cini
 *
 */

public class RectangleMethod 
{
	//Create Private Variables
	private double length;  
	private double width;
	private double area;
	private double perimeter;

	
	//Constructor
	public RectangleMethod() 
	{ 
		this.length=0;
		this.width=0;
		this.area=0;
		this.perimeter=0;
	}
  
	
	// Constructor that receives input
	public RectangleMethod(double length, double width, double area, double perimeter) 
	{ 
		this.length=length;
		this.width=width;
		this.area = Double.parseDouble(formatDecimal(area));
		this.perimeter = Double.parseDouble(formatDecimal(perimeter));
	}
	
	
	//Getter for getting length
	public double getLength() 
	{ 
		return length;
	}
  
	
	//Setter for setting length
	public void setLength(double length) 
	{ 
		this.length = length;
	}
	
	//Getter for getting width
	public double getWidth() 
	{
		return width;
	}
	
	
	//Setter for setting width
	public void setWidth(double width) 
	{
		this.width = width;
	}
	
	
	//Getter for getting area
	public double getArea() 
	{
		return area;
	}
	
	
	//Setter for setting area
	public void setArea(double area) 
	{
		this.area = Double.parseDouble(formatDecimal(area));
	}
	
	
	//Getter for getting perimeter
	public double getPerimeter() 
	{
		return perimeter;
	}
	
	
	//Setter for setting perimeter
	public void setPerimeter(double perimeter) 
	{
		this.perimeter = Double.parseDouble(formatDecimal(perimeter));
	}
	
	//method for area
	public void area(double length, double width) 
	{
		this.area = length*width;
	}
	
	//method for perimeter
	public void perimeter(double length, double width) 
	{
		this.perimeter = (length*2)+(width*2);
	}
	
	//method for Deciaml Format
	public String formatDecimal(double input) 
	{
		DecimalFormat dec = new DecimalFormat("###.###");
		return dec.format(input);
	}
	
	//Creates a toString method for showing rectangle details
	public String toStringAll() 
	{
		return "Length: " + length + "cm\nWidth: " + width + "cm\nArea: " + area + "cm\nPerimeter: " + perimeter +"cm";
	}
	public String toStringArea() 
	{
		return "Length: " + length + "cm\nWidth: " + width + "cm\nArea: "+ area;
	}
	
	public String toStringPerimeter() 
	{
		return "Length: " + length + "cm\nWidth: " + width + "cm\nPerimeter: "+ perimeter;
	}
	
	
}
