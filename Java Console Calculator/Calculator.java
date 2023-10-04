import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num1, num2;
        char operator;

        // take num1 from user
        System.out.print("Enter frist numebr: ");
        num1 = scan.nextDouble();

        // take operator to perform operation
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scan.next().trim().charAt(0);

        // take num1
        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();

        double result;
        switch (operator){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 !=0){
                    result = num1 / num2;
                }else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result is: "+result);
    }
}