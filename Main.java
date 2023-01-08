import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<Item> shoppingCart = new ArrayList<>();

        String menuItems = "y";

        while(acc){
            System.out.println("--------------------------------------------------------");
            System.out.println("Welcome to Shofee");
            System.out.println("1: Create an Account");
            System.out.println("2: Log into an Account");
            System.out.println("--------------------------------------------------------");

            String log = input.nextLine();

            switch(log){
                case "1" :  signUp();
                            break;
                case "2" :  logIn();
                            break;
            }
        }

        boolean selection = true;

        while(selection) {
            System.out.println("--------------------------------------------------------");
            System.out.println("A: Add items to cart");
            System.out.println("V: View cart");
            System.out.println("E: Edit item");
            System.out.println("D: Delete item");
            System.out.println("C: Compute Total and Save the cart");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            menuItems = input.nextLine();
            System.out.println("--------------------------------------------------------");

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

    public static void addItemtoCart(ArrayList<Item> sCart) throws FileNotFoundException {

        Item item = new Item();

        boolean loop = true;

        while(loop){
            System.out.println("Item Name: ");
            String temp = input.nextLine();
    
            if(temp.length() < 6){
                item.set(temp);
                loop = false;
            }
            else{
                System.out.println("=================================");
                System.out.println("Item Name cannot exceed 5 letters");
                System.out.println("=================================");
            }
        }

        boolean lp = true;

        while(lp){
            System.out.println("Item Quantity: ");

            String quant = input.nextLine();
            double temp = Double.parseDouble(quant);

            if(Math.floor(temp) == temp){
                item.set(Integer.parseInt(quant));
                lp = false;
            }
            else{
                System.out.println("=================================");
                System.out.println("Quantity must be a whole number");
                System.out.println("=================================");
            }
        }




        
        System.out.println("Item Price: ");
        item.set(Double.parseDouble(input.nextLine()));

        updateCart();
    }

    public static void viewCart(ArrayList<Item> sCart) {
        view();
    }

    public static void editItem(ArrayList<Item> sCart) throws FileNotFoundException {

        Item item = new Item();

        view();

        System.out.println("-----------------------------------------------");

        System.out.println("Edit Item Number: ");
        int edit = Integer.parseInt(input.nextLine());

        System.out.println("-----------------------------------------------");
        System.out.println("# Item Name" + "  Quantity" + "   Price" + "   Total");
        System.out.println( (edit) + " " + Item.getItemName(edit - 1) +  "\t\t" + Item.getQuantity(edit - 1) + "\t" + String.format("%.2f", Item.getPrice(edit - 1)) + "\t" + String.format("%.2f", ((Item.getQuantity(edit - 1)) * (Item.getPrice(edit - 1)))));
        System.out.println("-----------------------------------------------");

        System.out.println("New Item Name: ");
        String name = input.nextLine();
        System.out.println("New Item Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.println("New Item Price: ");
        double price = Double.parseDouble(input.nextLine());

        item.editItem(edit, name, quantity, price);

        updateCart();
    }

    public static void deleteItem(ArrayList<Item> sCart) throws FileNotFoundException {

        view();
        
        System.out.println("Delete Item Number: ");

        Item item = new Item();

        item.removeItem(Integer.parseInt(input.nextLine()));

        updateCart();
    }

    public static void checkOut(ArrayList<Item> sCart) throws FileNotFoundException {
        view();

        double sum = 0;

        for(int y = 0; y < Item.getLength(); y++){
            sum += ((Item.getQuantity(y)) * (Item.getPrice(y)));
        }

        System.out.println("\nNet payment: " + sum);

        updateCart();

        clearCart(sCart);
    }

    public static void clearCart(ArrayList<Item> sCart) {
        Item item = new Item();
        int length = Item.getLength();
        for(int i = 0; i < length; i++)
            item.clear();
    }

    public static void signUp() throws IOException{
        
        Account account =  new Account();

        if(account.userExists()){
            System.out.println("=======================");
            System.out.println("Account already exists");
            System.out.println("=======================");
            return;
        }

        System.out.print("Enter your username: ");
        String username = input.nextLine();
        String password = new String();

        boolean validation = true;

        while(validation){
            System.out.print("Enter your password: ");
            password = input.nextLine();
            String passRegex = "^(?=.*?[A-Z])(?=.*?[#?!@$%^&*-])(?=.*?[0-9]).{8,}$";
            Pattern passPattern = Pattern.compile(passRegex);

            if(!passPattern.matcher(password).matches()){
                System.out.println("=======================");
                System.out.println("INVALID FORMAT");
                System.out.println("the password should consist at least 8 characters, 1 Special Character, 1 number, and 1 Uppercase letter");
                System.out.println("=======================");
            }
            else{
                validation = false;
            }
        }

        account.user(username, password);
    }

    public static boolean acc = true;

    public static void logIn() throws IOException{
        Login login = new Login();

        boolean log = true;

        if(!login.userExists()){
            System.out.println("No account exists yet.");
            return;
        }

        while(log){
            System.out.print("Enter your username: ");
            String username = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();
    
            if(login.loginUser(username, password)){
                log = false;
            }
            else{
                System.out.println("=======================");
                System.out.println("INVALID");
                System.out.println("=======================");
            }
        }
        acc = false;

        File file = new File("Cart.txt");
        file.createNewFile();

        loadCart();
    }

    public static void view(){
        
        int length = Item.getLength();

        System.out.println("# Item Name" + "\tQuantity" + "\tPrice" + "\tTotal");

        for (int x = 0; x < length; x++){
            System.out.println( (x + 1) + " " + Item.getItemName(x) +  "\t\t" + Item.getQuantity(x) + "\t\t" + String.format("%.2f", Item.getPrice(x)) + "\t" + String.format("%.2f", ((Item.getQuantity(x)) * (Item.getPrice(x)))));
        }
    }

    public static void loadCart() throws FileNotFoundException{
        Item item = new Item();

        Scanner acc = new Scanner(new File("Cart.txt"));

        while(acc.hasNextLine()){
            item.set(acc.nextLine());
            item.set(Integer.parseInt(acc.nextLine()));
            item.set(Double.parseDouble(acc.nextLine()));
        }
    }

    public static void updateCart() throws FileNotFoundException{
        int length = Item.getLength();
        
        File file = new File("Cart.txt");
        PrintWriter pw = new PrintWriter(file);
        for (int x = 0; x < length; x++){
            pw.println(Item.getItemName(x));
            pw.println(Item.getQuantity(x));
            pw.println(String.format("%.2f", Item.getPrice(x)));
        }
        pw.close();
    }
}
