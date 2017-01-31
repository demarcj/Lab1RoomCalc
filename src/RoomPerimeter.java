import java.util.Scanner;

/**
 * Created by DeMarc Johnson
 * 1/30/2017
 */
public class RoomPerimeter {
    public static void main(String [] args){
        System.out.println("Welcome to Grand Circus\' Room Detail Generator!");

        //Basic reference for the while loop
        Scanner scan = new Scanner(System.in);
        String text = "";

        //This do while loop allow the user to restart the program if not satisfy with the answer
        do {
            System.out.print("Enter Length: ");
            double length = scan.nextDouble();

            System.out.print("Enter Width: ");
            double width = scan.nextDouble();

            double area = length * width;
            double perimeter = length * 2 + width * 2;

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("");
            System.out.println("Continue?(y/n): ");
            text = scan.next();
        }
        while(text.equals("y"));
        System.out.print("Goodbye")
        scan.close();
    }
}
