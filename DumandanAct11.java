import java.util.*;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DumandanAct11{
    static String OfficialEmail;
    static String OfficialPassword;
    static String OfficialWebsite;
    public static boolean InvalidEmail(String Emailaddress){   
        Scanner sc = new Scanner(System.in);
    do{
    if(Emailaddress.contains("@yahoo.com") || Emailaddress.contains("@addu.edu.ph") || Emailaddress.contains("@gmail.com")){
        OfficialEmail = Emailaddress;
        return false;
    }else{
        System.out.println("Invalid Email please try again(@yahoo.com/@addu.edu.ph/@gmail.com): ");
        Emailaddress = sc.nextLine();
        }
    }while(true);
}

    static boolean PassChecker(String Password){ 
        /*Reference Code: https://stackoverflow.com/questions/1795402/check-if-a-string-contains-a-special-character 
        alternative method could be individual checking of char via for loop and ASCII but code so long:))
        */
      Scanner sc = new Scanner(System.in);
            Pattern SpecialChar = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Pattern numbers = Pattern.compile("[0-9]");
            Pattern Capital = Pattern.compile("[A-Z]");
           
            do{

                Matcher hasLetter = Capital.matcher(Password);
                Matcher hasNumbers = numbers.matcher(Password);
                Matcher hasSpecialChar = SpecialChar.matcher(Password);

                if(Password.length() > 7 && hasLetter.find() && hasNumbers.find() && hasSpecialChar.find()){
                    OfficialPassword = Password;
                 return true;

                }else{
                    System.out.println("The password should consist at least 8 characters, 1 Special Character, 1 number, and 1 Uppercase letter\nPlease Try Again: ");
                    Password = sc.nextLine();
                }
            }while(true);
    }
    public static boolean InvalidWebsite(String website){   
        Scanner sc = new Scanner(System.in);
    do{
    if(website.contains(".com") || website.contains(".com.ph") || website.contains(".org") || website.contains(".edu") || website.contains(".gov")){
        OfficialWebsite = website;
        return false;
    }else{
        System.out.println("Invalid Website please try again(.org/.com/.com.ph/.gov/.edu): ");
        website = sc.nextLine();
        }
    }while(true);
}
    

    public static void main(String[] args) throws Exception{
        String Fname,Mname,Lname, Month, day, Gender, Address, Cpnumber, AnnualSalary;
        int numOfPeople = 0, year, age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First name: "); Fname = sc.nextLine();
        System.out.print("Enter your middle initial: "); Mname = sc.nextLine();
        System.out.print("Enter your Last name: "); Lname = sc.nextLine();
        System.out.print("Enter your Birthdate: "); Month = sc.next(); day = sc.next(); year = sc.nextInt(); sc.nextLine();
        System.out.print("Enter the number of people in your household: "); numOfPeople = sc.nextInt(); sc.nextLine();
        System.out.print("Enter your annual salary: "); AnnualSalary = sc.nextLine(); 
        System.out.print("Enter your gender: "); Gender = sc.nextLine();
        System.out.print("Enter your address: "); Address = sc.nextLine();

        System.out.print("Enter your contact number: "); 
            do{
                Cpnumber = sc.nextLine(); 
                if(Cpnumber.length() > 11 || Cpnumber.length() < 11) 
                System.out.println("Please input a valid Cellphone Number#: ");
            }while(Cpnumber.length() != 11);

        System.out.print("Enter your email: ");  InvalidEmail(OfficialEmail = sc.nextLine());
        System.out.print("Enter your password: ");  PassChecker(OfficialPassword= sc.nextLine());
        System.out.print("Enter your website: "); InvalidWebsite(OfficialWebsite = sc.nextLine());
         
        //decimalformat(###,###,###.##)
        if(Month == "September" || Month == "October" || Month == "November" || Month == "December"){ //Month specific only not DAY
            age = (2021-year); //September-December
        }else{                          
            age = 2022 - year;  //January-August    
        }

        if(Gender.toLowerCase().charAt(0) == 'm'){ //Male User
            System.out.println(MessageFormat.format("Welcome, Mr. {0} {1} {2} to our system. Your birthdate is {3} {4} {5,number,#}, and you are {6} years old, your gender is {7} and you reside in {8}. The total number in your household is {9} and your annual salary is Php {10}. \nFor inquiries of his IT services, please contact him at {11} or send an email to {12}. You can also check his website at {13}. \nUser Account: {12}\nPassword:{14}", Fname,Mname,Lname,Month,day,year,age,Gender,Address,numOfPeople,AnnualSalary,Cpnumber,OfficialEmail,OfficialWebsite,OfficialPassword));
        }else{ //Female user
            System.out.println(MessageFormat.format("Welcome, Ms/Mrs. {0} {1} {2} to our system. Your birthdate is {3} {4} {5,number,#}, and you are {6} years old, your gender is {7} and you reside in {8}. The total number in your household is {9} and your annual salary is Php {10}. \nFor inquiries of her IT services, please contact her at {11} or send an email to {12}. You can also check her website at {13}. \nUser Account: {12}\nPassword:{14}", Fname,Mname,Lname,Month,day,year,age,Gender,Address,numOfPeople,AnnualSalary,Cpnumber,OfficialEmail,OfficialWebsite,OfficialPassword));
        }
    }
}