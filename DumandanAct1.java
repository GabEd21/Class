import java.util.Scanner;

public class DumandanAct1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Enter the radius (in cm): ");
        double radius = input.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2*pi*radius;
        double area = pi*Math.pow(radius,2);

        System.out.println("The diameter is " + diameter + " cm");
        System.out.println("The circumference is " + circumference + " cm");
        System.out.println("The area is " + String.format("%.7f", area) + " cm^2");
    }
}
