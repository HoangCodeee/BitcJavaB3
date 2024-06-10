import java.util.Scanner;

public class EquationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        Equation equation = new Equation();
        equation.CalculateQuadratic(a, b, c);

        scanner.close();
    }
}
