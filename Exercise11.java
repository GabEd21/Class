import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise11 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<Item> shoppingCart = new ArrayList<>();

        String menuItems = "y";
        boolean selection = true;

        while(selection) {
            System.out.println("-----------------------------------------------");
            System.out.println("A: Add items to cart");
            System.out.println("V: View cart");
            System.out.println("E: Edit item");
            System.out.println("D: Delete item");
            System.out.println("C: Compute Total and Save the cart");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            menuItems = input.nextLine();
            System.out.println("-----------------------------------------------");

            switch(menuItems.toUpperCase()) {
                case "A" :  addItemtoCart(shoppingCart);
                            break;
                case "V" :  viewCart(shoppingCart);
                            break;
                case "E" :  editItem(shoppingCart);
                            break;
                case "D" :  deleteItem(shoppingCart);
                            break;
                case "C" :  checkOut(shoppingCart);
                            break;
                case "Q" :  selection = false;
                            break;

            }
        }

    }

    public static void addItemtoCart(ArrayList<Item> sCart) {

        String name;
        int numitem;
        double price;

        name = input.nextLine();
        numitem = input.nextInt();
        price = input.nextDouble();

        Item items = new Item(name, numitem, price);

        sCart.add(items);
    }

    public static void viewCart(ArrayList<Item> sCart) {
        double total = 0;
        int count = 0;

        for(Item temp:sCart){
            count ++;
            System.out.println(count + ". " + temp + "\t" + String.format("%.2f", temp.getNumitem() * temp.getPrice()));
            total += temp.getNumitem() * temp.getPrice(); 
        }

        System.out.println("Total Amount: " + String.format("%.2f", total));

    }

    public static void editItem(ArrayList<Item> sCart) {
        int chose;

        viewCart(sCart);

        System.out.println("Which item should you remove? (pick a number)");
        chose = input.nextInt();

        sCart.remove(chose-1);
    }

    public static void deleteItem(ArrayList<Item> sCart) {

        int length = sCart.size();

        sCart.remove(length);
    }

    public static void checkOut(ArrayList<Item> sCart) throws IOException {

        double total = 0;

        for(Item temp:sCart){
            System.out.println(temp + "\t" + String.format("%.2f", temp.getNumitem() * temp.getPrice()));
            total += temp.getNumitem() * temp.getPrice(); 
        }

        System.out.println("Total Amount of purchase " + String.format("%.2f", total));
        System.out.println("\t" + "Thank you for shopping!");

        PrintWriter pw = new PrintWriter("cart.txt");
        for (int index = 0; index < sCart.size(); index++) {
            pw.println(sCart.get(index).toString());
        }
        pw.close();
    }

    public static void clearCart(ArrayList<Item> sCart) {

        for(int i = 0; i <= sCart.size(); i++){
            sCart.remove(0);
        }
        sCart.remove(0);
    }
}