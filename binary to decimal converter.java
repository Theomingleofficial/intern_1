import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();

        // Convert the binary number to decimal
        int decimal = Integer.parseInt(binaryString, 2);

        // Print the decimal equivalent
        System.out.println("The decimal equivalent of " + binaryString + " is " + decimal);
    }
}
