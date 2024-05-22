import java.util.Scanner;

public class Console {
    
    private static Scanner reader = new Scanner(System.in);

    public static int readInt() {

        int num = reader.nextInt();
        reader.nextLine(); 
        return num;
    }

    public static String readString() {

        String txt = reader.nextLine();
        return txt;
    }

    public static float readFloat() {

        float num = reader.nextFloat();
        reader.nextLine(); 
        return num;
    }

    public static double readDouble() {

        double num = reader.nextDouble();
        reader.nextLine(); 
        return num;
    }
}