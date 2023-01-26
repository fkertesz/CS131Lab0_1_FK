/*
 * This class creates a Circle object in an application class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 0.1
 * SP 2023
 */
public class Circle
{
	private double radius; //this variable will store the radius of the circle
	
	
	/*
	 * The empty-argument constructor initializes the instance variables
	 */
	public Circle()
	{
		radius = 0;
	}//end constructor
	
	
	/*
	 *@param preferredRadius will be the preferred radius sent into the method
	 */
	public Circle(double preferredRadius)
	{
		radius = preferredRadius;
	}//end constructor
	
	
	/*
	 * @param newRadius, the new radius set
	 */
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}//end setRadius
	
	
	/*
	 * @return the current radius of the circle
	 */
	public double getRadius()
	{
		return radius;
	}//end getRardius
	
	
	/*
	 * This method calculates the area of the circle
	 * @return the area of the circle
	 */
	public double area()
	{
		return (radius*radius*Math.PI);
	}//end area
}//end class
