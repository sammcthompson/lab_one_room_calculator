import java.util.Scanner;

public class room_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Room Detail Generator!");
		String choice;

	do {
		System.out.println("Enter length of room: ");
		double length = input.nextDouble();
		System.out.println("Enter width of room: ");
		double width = input.nextDouble();
		
		double area = length * width;
		double perimeter = (length + width) * 2;
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		
		  System.out.print("Do you want to calculate another room? (Y/N) ");
          choice = input.next();
      } while (choice.equalsIgnoreCase("Y") && !(choice.equalsIgnoreCase("N")));
      System.out.println("Goodbye");
      input.close();
	}
	}

	
	
	
	
	
	




