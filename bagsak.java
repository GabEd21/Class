import java.util.Scanner;

public class bagsak{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int val = Integer.parseInt(input.nextLine());
        
        int[] days = new int[val];
        int[] hours = new int[val];
        int[] minutes = new int[val];
        int[] seconds = new int[val];
        
        for(int i = 0; i < val; i++){
            days[i] = input.nextInt();
            hours[i] = input.nextInt();
            minutes[i] = input.nextInt();
            seconds[i] = input.nextInt();
        }
        
        for(int i = 0; i < val; i++){
            
            int oras = 0;
            int minuto = 0;
            int secondo = 0;

            while(seconds[i] >= 60){
                seconds[i] = seconds[i] - 60;
                secondo ++;
            }

            minutes[i] = minutes[i] + secondo;

            while(minutes[i] >= 60){
                minutes[i] = minutes[i] - 60;
                minuto ++;
            }

            hours[i] = hours[i] + minuto;
            
            while(hours[i] >= 24){
                hours[i] = hours[i] - 24;
                oras ++;
            }
        
            
            
            int finalday = days[i] + oras;
            int finalhours = hours[i];
            int finalminutes = minutes[i];
            int finalsecond = seconds[i];
            
            if(finalday == 0 && finalhours == 0 && finalminutes == 0 && finalsecond == 0){
                System.out.println("");
            }else if(finalday == 0 && finalhours == 0 && finalminutes == 0){
                System.out.println(finalsecond + " Seconds");
            }else if(finalday == 0 && finalhours == 0 && finalsecond == 0){
                System.out.println(finalminutes + " Minutes");
            }else if(finalday == 0 && finalminutes == 0 && finalsecond == 0){
                System.out.println(finalhours + " Hours");
            }else if(finalhours == 0 && finalminutes == 0 && finalsecond == 0){
                System.out.println(finalday + " Days");
            }else if(finalday == 0 && finalhours == 0){
                System.out.println(finalminutes + " Minutes, " + finalsecond + " Seconds");
            }else if(finalday == 0 && finalminutes == 0){
                System.out.println(finalhours + " Hours, " + finalsecond + " Seconds");
            }else if(finalday == 0 && finalsecond == 0){
                System.out.println(finalhours + " Hours, " + finalminutes + " Minutes");
            }else if(finalhours == 0 && finalminutes == 0){
                System.out.println(finalday + " Days, " + finalsecond + " Seconds");
            }else if(finalhours == 0 && finalsecond == 0){
                System.out.println(finalday + " Days, " + finalminutes + " Minutes");
            }else if(finalminutes == 0 && finalday == 0){
                System.out.println(finalhours + " Hours, " + finalsecond + " Seconds");
            }else if(finalminutes == 0 && finalsecond == 0){
                System.out.println(finalday + " Days, " + finalhours + " Hours, ");
            }else if(finalday == 0){
                System.out.println(finalhours + " Hours, " + finalminutes + " Minutes, " + finalsecond + " Seconds");
            }else if(finalhours == 0){
                System.out.println(finalday + " Days, " + finalminutes + " Minutes, " + finalsecond + " Seconds");
            }else if(finalminutes == 0){
                System.out.println(finalday + " Days, " + finalhours + " Hours, " + finalsecond + " Seconds");
            }else if(finalsecond == 0){
                System.out.println(finalday + " Days, " + finalhours + " Hours, " + finalminutes + " Minutes");
            }else{
                System.out.println(finalday + " Days, " + finalhours + " Hours, " + finalminutes + " Minutes, " + finalsecond + " Seconds");
            }
        }
    }
}
