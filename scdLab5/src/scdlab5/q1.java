package scdlab5;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a capital letter: ");
            String input = scanner.nextLine();
            checkInput(input);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }

    static void checkInput(String input) throws CustomException {
        if (input.length() != 1 || !Character.isUpperCase(input.charAt(0))) {
            throw new CustomException("Some error occurred");
        } else if (input.charAt(0) == 'A' || input.charAt(0) == 'B') {
            throw new CustomException("A");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
