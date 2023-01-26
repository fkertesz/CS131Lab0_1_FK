/*
 * This class applies the Square and Circle classes
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 0.1
 * SP 2023
 */
public class Application
{
	/*
	 * Main method allows execution of the class
	 * @param String[] args, command line arguments
	 */
	public static void main(String[] args)
	{
		Square newSquare = new Square(2); //creates a new Square object with a side length of 2
		System.out.println("Square area: " + newSquare.area()); //prints out the area of newSquare
		
		Circle newCircle = new Circle(1); //creates a new Circle object with a radius of 1
		System.out.println("Circle area: " + newCircle.area());//prints out the area of newCircle
	}//end main
}//end class
