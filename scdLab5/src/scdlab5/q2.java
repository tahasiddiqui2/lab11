package scdlab5;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            checkInput(input);
        } catch (InvalidCharacter e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }

    static void checkInput(String input) throws InvalidCharacter {
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new InvalidCharacter("Some error occurred");
            }
        }
    }
}

class InvalidCharacter extends Exception {
    public InvalidCharacter(String message) {
        super(message);
    }
}
