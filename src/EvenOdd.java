import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Please enter your name: ");
		name = sc.nextLine();
		
		char userInput = 'y';
		
		do {
			System.out.println("Hi " + name + ", please enter a number between 1 to 100: ");
			int num = sc.nextInt();
			
			while(num > 100 || num < 1) {
				System.out.println("sorry " + name + ", you entry is out of range, please try again: ");
				num = sc.nextInt();
			}
			//System.out.println("test");
		
			if(num % 2 != 0) {
				System.out.println(num + " is an odd number.");
				if(num > 60) {
					System.out.println("An odd number and over 60.");
				}
			}
			else {
				if(num >=2 && num < 25) {
					System.out.println(num + " is an even number and less than 25.");
				}
				else if(num >=26 && num <=60){
					System.out.println(num + " is an even number.");
				}
				else {
					System.out.println(num + " is an even number and over 60.");
				}
			}
			System.out.println("Would you like to continue(y/n): ");
			userInput = sc.next().charAt(0);
			userInput = Character.toLowerCase(userInput);
			
		}while(userInput == 'y');
		System.out.println("Goodbye " + name + ".");
		sc.close();
	}

}
