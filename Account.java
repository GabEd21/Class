import java.io.*;

public class Account {
    public void user(String x, String y) throws IOException{
        File file = new File("Account.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println(x);
        pw.println(y);

        pw.close();
    }

    public boolean userExists(){
        File f = new File("Account.txt");
        if(f.exists() && !f.isDirectory()) { 
            return true;
        }
        else{
            return false;
        }
    }
}
