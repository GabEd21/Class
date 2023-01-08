import java.util.Scanner;

public class DumandanAct3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double pi = 3.14159265359;

        System.out.println("Cylinder");
        System.out.print("Enter the radius: ");
        double r = input.nextDouble();
        System.out.print("Enter the height: ");
        double h = input.nextDouble();
        System.out.println("Cone");
        System.out.print("Enter the radius: ");
        double r2 = input.nextDouble();
        System.out.print("Enter the height: ");
        double h2 = input.nextDouble();

        double ca = 2* pi * r *(r+h);
        double sq = Math.sqrt(Math.pow(h2,2) + Math.pow(r2,2));
        double sa2 = pi * r2 * (r2 + sq);

        System.out.println("The area of the cylinder is " + String.format("%.2f",ca) + " and the area of the cone is " + String.format("%.2f",sa2) + ".");



    }
}
