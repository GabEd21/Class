import java.util.Scanner;

class DumandanAct10{ 
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String Inputname;
    int high = 0;
    char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char Letter = '\0';

        do{
            Inputname = input.nextLine();
        if(Inputname.contains("quit")) 
        break;
        for(int i = 0; i < 26; i++){ 
            int repeat = 0;
            for(int k = 0; k < Inputname.length(); k++){
                if(Inputname.toLowerCase().charAt(k) == alphabet[i]){
                    repeat += 1;
                    }
                }
                if(high < repeat){
                     high = repeat; 
                     Letter = alphabet[i];
                }
            }
            System.out.println(Letter +"="+ high);
            high = 0;
            Letter = '\0';
        }while(Inputname != "\0"); 
    }
}