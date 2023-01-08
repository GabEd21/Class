import java.util.Scanner;

public class DumandanAct9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = 0; int b = 0; int c = 0; int d = 0; int e = 0;
        int f = 0; int g = 0; int h = 0; int i = 0; int j = 0;
        int k = 0; int l = 0; int m = 0; int n = 0; int o = 0;
        int p = 0; int q = 0; int r = 0; int s = 0; int t = 0;
        int u = 0; int v = 0; int w = 0; int x = 0; int y = 0;
        int z = 0;

        char count;

        String word = input.nextLine();
        String word2 = word.toLowerCase();

        for(int i2 = 0; i2 < word2.length(); i2++){
            count = word2.charAt(i2);
            if(count == 'a'){
                a++;
            }else if(count == 'b'){
                b++;
            }else if(count == 'c'){
                c++;
            }else if(count == 'd'){
                d++;
            }else if(count == 'e'){
                e++;
            }else if(count == 'f'){
                f++;
            }else if(count == 'g'){
                g++;
            }else if(count == 'h'){
                h++;
            }else if(count == 'i'){
                i++;
            }else if(count == 'j'){
                j++;
            }else if(count == 'k'){
                k++;
            }else if(count == 'l'){
                l++;
            }else if(count == 'm'){
                m++;
            }else if(count == 'n'){
                n++;
            }else if(count == 'o'){
                o++;
            }else if(count == 'p'){
                p++;
            }else if(count == 'q'){
                q++;
            }else if(count == 'r'){
                r++;
            }else if(count == 's'){
                s++;
            }else if(count == 't'){
                t++;
            }else if(count == 'u'){
                u++;
            }else if(count == 'v'){
                v++;
            }else if(count == 'w'){
                w++;
            }else if(count == 'x'){
                x++;
            }else if(count == 'y'){
                y++;
            }else if(count == 'z'){
                z++;
            }
        }

        System.out.println("a=" + a + "," + "b=" + b +","+ "c=" + c + ","+ "d=" + d + "," + "e=" + e + "," + "f=" + f + "," + "g=" + g + "," + "h=" + h + "," + 
        "i=" + i +"," + "j=" + j + "," + "k=" + k + "," + "l=" + l + "," + "m=" + m + "," + "n=" + n + "," + "o=" + o + "," + "p=" + p + "," +
        "q=" + q + "," + "r=" + r + "," + "s=" + s + "," + "t=" + t + "," + "u=" + u + "," + "v=" + v + "," + "w=" + w + "," + "x=" + x + "," +
        "y=" + y + "," + "z=" + z + ",");
    }
}
