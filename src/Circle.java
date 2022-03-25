import java.util.Scanner;

public class Circle extends Shape{
	int radius;
	
	public void acceptDetails()		
	{
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		radius=sc.nextInt();
	}
	
	public String calculateArea()
	{
		return "22/7*r*r";
	}
	
}
