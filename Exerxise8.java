import java.util.Scanner;

public class Exerxise8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        int inputs[] = new int[num];

        for(int i = 0; i < num; i++){
            inputs[i] = input.nextInt();
        }

        int highest = inputs[0];

        for(int j = 0; j < num; j++){
            if(highest < inputs[j]){
                highest = inputs[j];
            }
        }

        for(int i = 0; i < num;i++){
            int result = highest - inputs[i];

            if(result > 40){
                System.out.println("Student " + i + " score is " + inputs[i] + " and grade is F");
            }else if(result <= 10){
                System.out.println("Student " + i + " score is " + inputs[i] + " and grade is A");
            }else if(result <= 20){
                System.out.println("Student " + i + " score is " + inputs[i] + " and grade is B");
            }else if(result <= 30){
                System.out.println("Student " + i + " score is " + inputs[i] + " and grade is C");
            }else if(result <= 40){
                System.out.println("Student " + i + " score is " + inputs[i] + " and grade is D");
            }
        }
    }
}
