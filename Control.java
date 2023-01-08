import java.util.Scanner;

public class Control {
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
            for(int j = 0; i < inputs[i].length(); j++){
              
            }
            if(Character.isSpaceChar(inputs[i].charAt(0)) || Character.isDigit(inputs[i].charAt(0)) ||
              inputs[i].length() > 10 || inputs[i].length() == ' ')
            {

              System.out.println("Case #" + (i+1) + " Invalid");

            }else if( inputs[i].length() == '#' || inputs[i].length() == '_'){

              System.out.println("Case #" + (i+1) + " Valid");

            }else{

              System.out.println("Case #" + (i+1) + " Valid");

            }
          }
        }
    }
}
