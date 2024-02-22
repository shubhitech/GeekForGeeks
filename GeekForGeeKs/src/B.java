

	
	import java.util.Scanner;

	public class B {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array of the specified size
	        int[] array = new int[size];

	        // Fill the array using user input
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Print the filled array
	        System.out.println("Array elements:");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }

	        // Close the scanner to prevent resource leak
	        scanner.close();
	    }
	}



