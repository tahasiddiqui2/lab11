package scdlab5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            int length = inputString.length();
            System.out.println("Length of the string: " + length);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
                writer.write(inputString);
                System.out.println("String has been written to 'output.txt'.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
                String line;
                System.out.println("Fetching characters from 'output.txt':");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading from the file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Some error occurred: " + e.getMessage());
        }
    }
}
