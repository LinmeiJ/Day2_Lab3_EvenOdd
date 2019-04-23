import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char userInput = 'y';
		
		do {
			System.out.println("Please enter a number between 1 to 100: ");
			int num = sc.nextInt();
			while(num > 100 || num < 1) {
				System.out.println("You entry is out of range, please try again: ");
				num = sc.nextInt();
			}
			//System.out.println("test");
			
		
		

			if(num % 2 != 0) {
				System.out.println(num + " is odd number");
				if(num > 60) {
					System.out.println("Odd and over 60");
				}
			}
			else {
				if(num >=2 && num < 25) {
					System.out.println(num + " is even number and less than 25");
				}
				else if(num >=26 && num <=60){
					System.out.println(num + " is even number");
				}
				else {
					System.out.println(num + " is even number and over 60");
				}
			}
			System.out.println("Would you like to continue(y/n): ");
			userInput = sc.next().charAt(0);
			userInput = Character.toLowerCase(userInput);
			
		}while(userInput == 'y');
		System.out.println("Goodbye");
		sc.close();
	}

}
