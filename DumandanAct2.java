import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class DumandanAct2 {
    public static void main(String[] args) {

        int monthn;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fname = input.nextLine();
        System.out.print("Enter your middle initial: ");
        String mname = input.nextLine();
        System.out.print("Enter your last name: ");
        String lname = input.nextLine();
        System.out.print("Enter your Birthdate: ");
        String month = input.next();
        int day = input.nextInt();
        int year = input.nextInt();

        System.out.print("Enter the number of people in your household: ");
        int housep = input.nextInt();

        input.nextLine();

        System.out.print("Enter your annual salary: ");
        String salary = input.nextLine();

        System.out.print("Enter your gender: ");
        String sex = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        if(month.equals("January")){
            monthn = 1;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println("The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println("The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("Febuary")){
            monthn = 2;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("March")){
            monthn = 3;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("April")){
            monthn = 4;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("May")){
            monthn = 5;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("June")){
            monthn = 6;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("July")){
            monthn = 7;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println("The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("August")){
            monthn = 8;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("September")){
            monthn = 9;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("October")){
            monthn = 10;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("November")){
            monthn = 11;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }else if(month.equals("December")){
            monthn = 12;
            LocalDate today = LocalDate.now();
            LocalDate birth = LocalDate.of(year, monthn, day);
            int age = Period.between(birth, today).getYears();
            if(sex.equals("Male")){
                System.out.print("Welcome, Mr. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is male and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }else{
                System.out.print("Welcome, Ms. " + fname + " " + mname + " " +  lname + " to our system. Your birthdate is " + month + " " + day + " " + year + ", " + "and you are "
                 + age + " years old, your gender is female and you reside in " + address + ".");
                System.out.println(" The total number of people in your household is " + housep + " and your annual salary is Php " + salary + "."); 
            }
        }
    }
}
