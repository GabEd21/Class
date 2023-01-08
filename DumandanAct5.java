import java.util.Scanner;

public class DumandanAct5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a grade : ");
        double grade = input.nextDouble();

        if(grade > 100){
            System.out.println("Invalid Grade");
        }else if(grade >= 91.5){
            System.out.println("The equivalent of " + grade + " is A.");
        }else if(grade >= 87.5){
            System.out.println("The equivalent of " + grade + " is B+.");
        }else if(grade >= 83.5){
            System.out.println("The equivalent of " + grade + " is B.");
        }else if(grade >= 79.5){
            System.out.println("The equivalent of " + grade + " is C+.");
        }else if(grade >= 75.5){
            System.out.println("The equivalent of " + grade + " is C.");
        }else if(grade >= 71.5){
            System.out.println("The equivalent of " + grade + " is D.");
        }else{
            System.out.println("The equivalent of " + grade + " is F.");
        }
    }
}
