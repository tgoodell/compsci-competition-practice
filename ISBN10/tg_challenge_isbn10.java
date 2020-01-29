import java.util.Scanner;
import java.io.File; 
import java.util.*;

public class tg_challenge_isbn10 {
	public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
			System.out.println("Do you want to manually input an ISBN number or provide a file (number/file)?");
			String command = keyboard.nextLine();
			String isbn = "";
			String trueISBN = "";
			
			if (command.equals("number")) {
				System.out.println("You picked number.\n");
				System.out.println("Enter an ISBN: ");
				isbn = keyboard.nextLine();
				trueISBN = isbn.replaceAll("[^0-9]", ""); 
				if ((trueISBN.length() == 10) || (trueISBN.length() == 13)) {
					System.out.println("Correct length!");
					if (trueISBN.length() == 10) {
						int sumISBN = (10 * trueISBN.charAt(0) + 9 * trueISBN.charAt(1) + 8 * trueISBN.charAt(2) + 7 * trueISBN.charAt(3) + 6 * trueISBN.charAt(4) + 5 * trueISBN.charAt(5) + 4 * trueISBN.charAt(6) + 3 * trueISBN.charAt(7) + 2 * trueISBN.charAt(8) + 1 * trueISBN.charAt(9));
						System.out.println(sumISBN);
						int output = sumISBN % 10;
						System.out.println(output);
					}
					
					else {
						
					}
				}
				else {
					System.out.println("Bad ISBN.");
					System.out.println("-----------\n");
				}
			}
			
			else if (command.equals("file")) {
				System.out.println("You picked file.");
			}
			
			else if (command.equals("exit")) {
				System.out.println("Exiting...");
				System.exit(0);
			}
			
			else {
				System.out.println("Command invalid.");
			}
		}
    }
}
