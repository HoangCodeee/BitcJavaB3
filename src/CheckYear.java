public class CheckYear {

    public void CheckLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}