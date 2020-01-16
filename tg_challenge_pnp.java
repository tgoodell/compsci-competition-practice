import java.util.Scanner;
import java.io.File; 
import java.util.*;

public class tg_challenge_pnp {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int check = 0;
		
		while (check == 0) {
			System.out.println();
			System.out.println("Enter a ten digit phone number.");
			String input = keyboard.nextLine();
			if (input.equals("exit")) {
				System.out.println("Exiting...");
				System.exit(0);
			}
			else if (check == 0) {
				String output = input.replaceAll("[^0-9]", ""); 
				int outputLength = output.length();
				if (outputLength != 10) {
					System.out.println("Please do it correctly.");
				}
				else {
					System.out.print("Phone Number: (" + output.charAt(0) + output.charAt(1) + output.charAt(2) + ")" + output.charAt(3) + output.charAt(4) + output.charAt(5) + "-" + output.charAt(6) + output.charAt(7) + output.charAt(8) + output.charAt(9));
				}
			}
		}
	}
}

