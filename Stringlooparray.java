import java.util.Scanner;

public class Stringlooparray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        String [] inputs = new String[num];

        for(int i = 1; i < num; i++){
            System.out.println(""+i);
            inputs[i] = input.nextLine();
        }
        
        
    }
}
