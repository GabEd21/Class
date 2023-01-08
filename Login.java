import java.util.Scanner;
import java.io.*;

public class Login extends Account{
    public boolean loginUser(String x, String y) throws FileNotFoundException{
        Scanner acc = new Scanner(new File("Account.txt"));

        String username = acc.nextLine();
        String password = acc.nextLine();

        if(x.equals(username) && y.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
