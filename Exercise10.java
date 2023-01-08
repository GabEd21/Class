import java.util.Scanner;
import java.util.ArrayList;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        ArrayList<Exercise10shop> shop = new ArrayList<>();

        String add;
        String name;
        int numitem;
        double price;
        double total = 0;

        do{
            name = input.nextLine();
            numitem = input.nextInt();
            input.nextLine();
            price = input.nextDouble();
            input.nextLine();

            Exercise10shop items = new Exercise10shop(name, numitem, price);

            shop.add(items);

            add = input.nextLine();

            
        }while (add.equalsIgnoreCase("y"));

        for(Exercise10shop temp:shop){
            System.out.println(temp + "\t" + String.format("%.2f", temp.getNumitem() * temp.getPrice()));
            total += temp.getNumitem() * temp.getPrice();
        }

        System.out.println("Total amount is shopping cart: " + String.format("%.2f", total));
        System.out.println(shop.get(0));
    }
}
