import java.util.Scanner;

public class DumandanAct6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       while(true){

        int year = input.nextInt();

        if(year % 4 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

        System.out.print("Do you want to enter another year? 1 - Yes   2 - No: ");
        int ch = input.nextInt();

        if(ch == 2){
            break;
        }

        year = 0;
       }
    }
}
