package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner reader = new Scanner(System.in);

    public static int readInt() {
        while (true) {
            try {
                int num = reader.nextInt();
                reader.nextLine(); 
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Not an integer, type again...");
                reader.nextLine(); 
            }
        }
    }

    public static String readString() {
        return reader.nextLine();
    }

    public static float readFloat() {
        while (true) {
            try {
                float num = reader.nextFloat();
                reader.nextLine(); //
                return num;
            } catch (InputMismatchException e) {
                System.out.println("The input is not a float. Please type again...");
                reader.nextLine(); 
            }
        }
    }

    public static double readDouble() {
        while (true) {
            try {
                double num = reader.nextDouble();
                reader.nextLine(); 
                return num;
            } catch (InputMismatchException e) {
                System.out.println("The input is not a double. Please type again...");
                reader.nextLine(); 
            }
        }
    }
}
