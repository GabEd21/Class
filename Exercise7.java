import java.util.Scanner;


public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise7date date = new Exercise7date();

        date.setYear(input.nextInt());
        date.setMonth(input.nextInt());
        date.setDay(input.nextInt());

        int Date[] = {date.getYear(),date.getMonth(),date.getDay()};

        if(Date[1] == 1){
            System.out.println("January " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 2){
            System.out.println("Febuary " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 3){
            System.out.println("March " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 4){
            System.out.println("April " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 5){
            System.out.println("May " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 6){
            System.out.println("June " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 7){
            System.out.println("July " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 8){
            System.out.println("August " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 9){
            System.out.println("September " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 10){
            System.out.println("October " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 11){
            System.out.println("November " + Date[2] + ", " + Date[0]);
        }else if(Date[1] == 12){
            System.out.println("December " + Date[2] + ", " + Date[0]);
        }

        System.out.println(date.days() + " days");
        System.out.println(date.getYear() + date.years());


    }
}
