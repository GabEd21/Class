import java.util.Scanner;
import java.util.ArrayList;

public class Exercise9 {
    public static void main(String[] args) {

        ArrayList<Integer> set = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            set.add(number);
        }

        for(int i = 0; i < set.size(); i++){
            if(set.get(i) < set.get(i+1)){
                System.out.print(set.get(i) + "," + set.get(i+1));

                if(i < set.size()-2){
                    System.out.print(",");
                }else{
                    break;
                }
            }
            i++;
        }
    }
}
