import java.util.Scanner;
import java.lang.Math;

public class Lab333 {

	public static void main(String[] args) {
		
		System.out.println("Lets learn your squares and cubes!!");
		
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		
		
		
		//while yes
		String choice;
		choice = "y";
		
		while (choice.equals("y")){
			
		//accepting input
		System.out.println("Enter an integer greater than 0");
		int x = userInput.nextInt();
		
		//Board setup
		
		
			System.out.println("Number" + "   " + "Squared"  + "   " + "Cubed");
			System.out.println("======" + "   " + "=======" +  "   " + "======");	
			
		for (int i = 1; i <= x; i++) {
			
			int result =(int) Math.pow(i,2);
			int result1 =(int) Math.pow(i, 3);
			
			
			String result2 = (i + "\t" +  result + "\t"+  result1);
			System.out.println(result2);			
		}
			//Continue block
			System.out.println("Continue? (y/n)");
			choice = userInput.next();
			System.out.println();
			
			
			
			
		}
		
	}
	}



	