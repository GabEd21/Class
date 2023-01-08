import java.util.Scanner;
import java.util.ArrayList;

public class NPV {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Double> cashflow = new ArrayList<>();
        ArrayList<Double> overall = new ArrayList<>();
        int i = 0;

        System.out.println("How much will you invest/ pay ?");
        double invest = input.nextDouble();
        
        while(true){
            i++;
            System.out.println(i + " year of the cashflow. Type '0' to stop input your cashflow");
            double cashyearly = input.nextDouble();

            if(cashyearly == 0){
                break;
            }

            cashflow.add(cashyearly);
        }
        System.out.println("Enter the percentage: ");
        double percent = input.nextDouble();
        double rate = percent/100;
        double total = 0;
        for(int j = 0; j < cashflow.size(); j++){
            overall.add(cashflow.get(j)/Math.pow((1+rate),j+1));
        }
        for(int j = 0; j < overall.size(); j++){
            System.out.println();
            System.out.printf("%.2f",overall.get(j));
        }
        for(int j = 0; j < overall.size(); j++){
            total = total + overall.get(j);
        }

        System.out.println();
        System.out.print("Your NPV is: $");
        double sum = total - invest;
        System.out.printf("%.2f",sum);
    }
}
