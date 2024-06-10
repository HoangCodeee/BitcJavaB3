public class Calculator {

    public void CalculatorInteger(String operation, int number1, int number2) {
        switch (operation) {
            case "+":
                System.out.println(number1+"+"+number2+"="+(number1+number2));
                break;
        
            case "-":
                System.out.println(number1+"-"+number2+"="+(number1-number2));
                break;
        
            case "*":
                System.out.println(number1+"*"+number2+"="+(number1*number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");;
        }

    }
}