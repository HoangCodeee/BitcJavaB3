public class Equation {
    public void CalculateQuadratic(int a, int b, int c) {
        if (a == 0 && b == 0) {
            System.out.println("The equation has no solution.");
        } else if (a == 0) {
            double x = (double) -c / b;
            System.out.println("The equation has one root: x = " + x);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no real solution.");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("The equation has a repeated root: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
