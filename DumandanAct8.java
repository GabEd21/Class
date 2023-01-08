import java.util.Scanner;

public class DumandanAct8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;

        while(true){
            int index;
            if(i == 3){
              System.out.print("Sorry. You already reached the maximum number of tries.");
              break;
            }
            System.out.print("Enter Fibonacci index: ");
            index = input.nextInt();

            if(index < 1 || index > 40){
                System.out.println("Invalid input");
            }else{
            int [] fibbo = new int[index];
            fibbo[0] = 0;
            fibbo[1] = 1;

            for(int j = 2; j < index; j++){
                fibbo[j] = fibbo[j-1] + fibbo[j-2];
            }
            for(int k = 0; k < index; k++){
                System.out.print(fibbo[k]);
                if(k < index - 1){
                    System.out.print(",");
                }else{
                    System.out.println("\n" + fibbo[index-1] + " is the last number");
                    break;
                }
            }
            break;
            }
            i++;
        }
    }
}
