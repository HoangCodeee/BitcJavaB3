import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();
        System.out.print("Enter the operation (+,-,*,/):");
        String operation =scanner.nextLine();
        System.out.print("Enter the first number: ");
        int number1=scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2=scanner.nextInt();
        calculator.CalculatorInteger(operation, number1, number2);
        scanner.close();

    }
}