import java.util.Scanner;

public class Control2 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int val = Integer.parseInt(input.nextLine());

      String[] inputs = new String[val];

      if(val > 100){
        System.out.println("Invalid number of Test Cases.");
      }else{

        for(int i = 0; i < val; i++){
         inputs[i] = input.nextLine();
        }

        for(int i = 0; i < val; i++){
          int count = 0;

          if(inputs[i].length() > 10){

            System.out.println("Case #" + (i+1) + " Invalid");

          }else{
            for(int j = 0; j < inputs[i].length(); j++){
              if(Character.isSpaceChar(inputs[i].charAt(j)) || Character.isDigit(inputs[i].charAt(0))){
                count++;
              }else if(inputs[i].charAt(j) == '2' || inputs[i].charAt(j) == '4' || inputs[i].charAt(j) == '6' || inputs[i].charAt(j) == '8' || inputs[i].charAt(j) == '0'){
                count++;
              }
            }

            if(count > 0){
              System.out.println("Case #" + (i+1) + " Invalid");
            }else{
              System.out.println("Case #" + (i+1) + " Valid");
            }
          }
        }
      }
    }
}
