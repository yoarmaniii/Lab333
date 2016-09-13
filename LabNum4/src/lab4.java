import java.util.Scanner;
public class lab4 {

	public static void main(String[] args) {
		
		System.out.println("Welcome!");
		System.out.println();
	
		
		String choice = "y";
		while (choice.equals("y")) {
			System.out.println("Enter an integer");
			Scanner userInput = new Scanner(System.in);
			long input= userInput.nextLong();
		
		long fact = 1;
		
		for (int i = 1; i <= input; i++) {
			fact *= i; 


		
	}
		System.out.println("the factorial of " + input + " " + "is" + " "+ fact);
		
		System.out.println("Continue? (y/n) ");
		choice = userInput.nextLine();
		choice = userInput.nextLine();
		System.out.println();	
	

	}
}
}