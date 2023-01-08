import java.util.Scanner;
import java.util.ArrayList;

public class testing{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> set = new ArrayList<>();
        
        String pass;
        
        while(true){
            pass = input.nextLine();
            if(pass.equals("end")){
                break;
            }
            set.add(pass);
        }
        
        for(int i = 0; i<set.size(); i++){
            if(set.get(i).length() > 20){
                System.out.println(set.get(i) + " is Invalid");
            }else{
                int counta = 0; 
                int counte = 0;
                int counti = 0;
                int counto = 0;
                int countu = 0;
                int count = 0;
                int countb = 0;
                int countc = 0;
                int countd = 0;
                int countf = 0;
                int countg = 0;
                int counth = 0;
                int countj = 0;
                int countk = 0;
                int countl = 0;
                int countm = 0;
                int countn = 0;
                int countp = 0;
                int countq = 0;
                int countr = 0;
                int counts = 0;
                int countt = 0;
                int countv = 0;
                int countw = 0;
                int countx = 0;
                int county = 0;
                int countz = 0;
                int capital = 0;
    
                for(int j = 0; j < set.get(i).length(); j++){
                    if(set.get(i).charAt(j) == 'a'){
                        counta++;
                        count++;
                    }else if(set.get(i).charAt(j) == 'e'){
                        counte++;
                        count++;
                    }else if(set.get(i).charAt(j) == 'i'){
                        counti++;
                        count++;
                    }else if(set.get(i).charAt(j) == 'o'){
                        counto++;
                        count++;
                    }else if(set.get(i).charAt(j) == 'u'){
                        countu++;
                        count++;
                    }else if (Character.isUpperCase(set.get(i).charAt(j))){
                        capital++;
                    }else if (set.get(i).charAt(j) == 'b'){
                        countb++;
                    }else if (set.get(i).charAt(j) == 'c'){
                        countc++;
                    }else if (set.get(i).charAt(j) == 'd'){
                        countd++;
                    }else if (set.get(i).charAt(j) == 'f'){
                        countf++;
                    }else if (set.get(i).charAt(j) == 'g'){
                        countg++;
                    }else if (set.get(i).charAt(j) == 'h'){
                        counth++;
                    }else if (set.get(i).charAt(j) == 'j'){
                        countj++;
                    }else if (set.get(i).charAt(j) == 'k'){
                        countk++;
                    }else if (set.get(i).charAt(j) == 'l'){
                        countl++;
                    }else if (set.get(i).charAt(j) == 'm'){
                        countm++;
                    }else if (set.get(i).charAt(j) == 'n'){
                        countn++;
                    }else if (set.get(i).charAt(j) == 'p'){
                        countp++;
                    }else if (set.get(i).charAt(j) == 'q'){
                        countq++;
                    }else if (set.get(i).charAt(j) == 'r'){
                        countr++;
                    }else if (set.get(i).charAt(j) == 's'){
                        counts++;
                    }else if (set.get(i).charAt(j) == 't'){
                        countt++;
                    }else if (set.get(i).charAt(j) == 'v'){
                        countv++;
                    }else if (set.get(i).charAt(j) == 'w'){
                        countw++;
                    }else if (set.get(i).charAt(j) == 'x'){
                        countx++;
                    }else if (set.get(i).charAt(j) == 'y'){
                        county++;
                    }else if (set.get(i).charAt(j) == 'z'){
                        countz++;
                    }
                }
                
                if(count > 3 || count < 1 || counta > 1 || counti > 1 || countu > 1 || countb > 1 || countc > 1 || countd > 1 || countf > 1 || countg > 1 || counth > 1
                || countj > 1 || countk > 1 || countl > 1 || countm > 1 || countn > 1 || countp > 1 || countq > 1 || countr > 1 || counts > 1 || countv > 1 || countw > 1 
                || countx > 1 || county > 1 || countz > 1 || capital > 0){
                        System.out.println(set.get(i) + " is Invalid");
                    }else{
                        System.out.println(set.get(i) + " is Valid");
                    }
                
            }
        }
    }
}