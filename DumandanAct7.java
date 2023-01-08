import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class DumandanAct7 {
    static double totals;
    public static void main(String[] args) {
        
        ArrayList<Double> set = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating Sales Program");

        while(true){
         System.out.print("Enter a product number: ");
         int product = input.nextInt();
         if(product == -1){
            break;
         }
         System.out.print("Enter quantity sold: ");
         double quantity = input.nextDouble();

          if(product == 1){
            double total = 2.98 * quantity;
            set.add(total);
         }else if (product == 2){
            double total = 4.50 * quantity;
            set.add(total);
         }else if (product == 3){
            double total = 9.98 * quantity;
            set.add(total);
         }else if (product == 4){
            double total = 4.49 * quantity;
            set.add(total);
         }else if (product == 5){
            double total = 6.87 * quantity;
            set.add(total);
         }
        }

        for(int i = 0; i < set.size(); i++){
             totals+=set.get(i);
        }
        DecimalFormat f = new DecimalFormat("#,##0.00");
        System.out.println("Total sales is $ " + f.format(totals));
    }
}
