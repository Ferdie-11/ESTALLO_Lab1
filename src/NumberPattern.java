import java.util.Scanner;//built in package providing by java to handle input coming from user

public class NumberPattern {
	    public static void main(String[] args) {
	    	  Scanner scanner = new Scanner(System.in);
	          System.out.print("Enter a number: ");
	          int n = scanner.nextInt(); // Maximum number for the middle row


	        // Print the top asterisk
	        System.out.println("*");

	        // Print the upper half of the pattern
	        for (int i = 1; i <= n; i++) {
	            // Print leading star
	            System.out.print("*");

	            // Print increasing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Print decreasing numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Print trailing star and move to the next line
	            System.out.println("*");
	        }

	        // Print the lower half of the pattern
	        for (int i = n - 1; i >= 1; i--) {
	            // Print leading star
	            System.out.print("*");

	            // Print increasing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Print decreasing numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Print trailing star and move to the next line
	            System.out.println("*");
	        }

	        // Print the bottom asterisk
	        System.out.println("*");
		
	    }
	}

