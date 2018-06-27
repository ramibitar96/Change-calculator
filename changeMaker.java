import java.util.Scanner;

public class changeMaker {
	public static void main(String[] args) {
		int change;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("how much change did you have? ");
		change = sc.nextInt();
		sc.close();
		System.out.println();
		if (change > 99 || change < 1) {
			System.out.print("Invalid amount of change");
			System.exit(0);
		}
		makeChange(change);
	}

	public static void makeChange(int change) {
		int quarters = change / 25;
		int dimes = (change % 25) / 10; 
		int nickels = ((change % 25) % 10) / 5;
		int pennies = (((change % 25) % 10) % 5); 

		System.out.println("Number of quarters given: " + quarters);
		System.out.println("Number of dimess given: " + dimes);
		System.out.println("Number of nickels given: " + nickels);
		System.out.println("Number of pennies given: " + pennies);
	}
		
}