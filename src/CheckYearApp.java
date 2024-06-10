import java.util.Scanner;

public class CheckYearApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        CheckYear checkYear= new CheckYear();
        System.out.println("Enter the year you want to check");
        int year =scanner.nextInt();
        checkYear.CheckLeapYear(year);

        scanner.close();

    }
}
