import java.util.Scanner;

public abstract class Shape {
	String name;
	String color;
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the color");
		color=sc.next();
	}
	
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Color"+this.color);
	}
	
	public abstract String calculateArea();

}
