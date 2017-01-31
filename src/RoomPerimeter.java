import java.util.Scanner;

/**
 * Created by DeMarcj on 1/30/2017.
 */
public class RoomPerimeter {
    public static void main(String [] args){
        System.out.println("Welcome to Grand Circus\' Room Detail Generator!");
        Scanner scan = new Scanner(System.in);
        String text = "";
        do {
            System.out.print("Enter Length: ");
            double length = scan.nextDouble();

            System.out.print("Enter Width: ");
            double width = scan.nextDouble();

            final double area = length * width;
            final double perimeter = length * 2 + width * 2;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("");
            System.out.println("Continue?(y/n): ");
            text = scan.next();
        }
        while(text.equals("y"));
        scan.close();
    }
}
