
public class Exercise7date {
    private int month;
    private int day;
    private int year;


    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Mutator Method

    public int days(){
            if(this.month == 2){
                return 29;
            }else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                return 30;
            }else{
                return 31;
            }
    }

    public String years(){
        if(this.month == 2){
            return " is a leap year";
        }else if(this.year % 4 != 0){
            return " is a common year";
        }else if(this.year % 100 != 0){
            return " is a leap year";
        }else if(this.year % 400 != 0){
            return " is a common year";
        }else{
            return " is a leap year";
        }
    }

}
