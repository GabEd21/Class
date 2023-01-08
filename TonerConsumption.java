import java.util.Scanner;

public class TonerConsumption{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double daily = 0;
        
        double cost = input.nextDouble();
        double days = input.nextDouble();
        
        for(int i = 0; i < days; i++){
             daily += input.nextDouble();
        }
        
        double costperpage = cost / cost;
        double average = daily / days;
        double averagedaily = average * costperpage;
        double lifespan = cost / average;
        
        System.out.println("Average daily cost of toner use is " + String.format("%.0f", averagedaily) + ".00");
        System.out.println("Toner lifetime is " + String.format("%.0f", lifespan) + " days");
    }
}