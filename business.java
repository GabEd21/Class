import java.util.Scanner;
import java.util.ArrayList;


public class business {
    public static void main(String[] args) {
        
        ArrayList<Integer> itemp = new ArrayList<>();
        ArrayList<String> itemn = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int number = 0;
        String n = "n";

        while(true){
            number++;

            System.out.println("Enter the name ingredient " + number + "(type n to stop) : ");
            String name = input.next();

            if(name.equals(n)){
                break;
            }
            System.out.println("Enter the price of " + name + ": ");  
            int price = input.nextInt();

            itemn.add(name);
            itemp.add(price);
        }

        for(int j = 0; j < itemn.size(); j++ ){
            
        }

    }
}
