import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Triangle\r\n" + 
				"2: Circle\r\n" + 
				"3: Rectangle\r\n" + 
				"4: Exit\r\n" + 
				"");
		
		int choice=sc.nextInt();
		Shape s=null;					//s is a ref var for the abstract class "Shape"
		switch(choice)
		{
		case 1:	//Triangle
			s=new Triangle();
			break;
		case 2:	//Circle
			s=new Circle();
			break;
		case 3:	//Rectangle
			s=new Rectangle();
			break;
		case 4:
			System.exit(0); 			///return;
		}
		s.acceptDetails();
		s.displayDetails();
		System.out.println(s.calculateArea());
	}

}

