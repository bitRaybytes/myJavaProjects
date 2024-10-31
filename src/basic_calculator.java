package JavaProjects.src;
import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basic calculation");
        System.out.println();
        System.out.println("Enter your to numbers");
        System.out.print("1. Number: ");
        double firstNumber = input.nextDouble();
        System.out.print("2. Number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Choose an operator x, -, /, *, %:");
        String operator = input.next();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")){
                if (operator.equals("+")){
                    double addition = firstNumber + secondNumber;
                    System.out.println("The result is: " + addition);
                } else if (operator.equals("-")) {
                    double minus = firstNumber - secondNumber;
                    System.out.println("The result is: " + minus);
                } else if (operator.equals("/")){
                    double divide = firstNumber / secondNumber;
                    System.out.println("The result is: " + divide);
                    if (secondNumber == 0){
                        System.err.println("You can't divide by 0!");
                    }
                } else if (operator.equals("*")){
                    double multiply = firstNumber * secondNumber;
                    System.out.println("The result is: " + multiply);
                } else if (operator.equals("%")){
                    double modulus = firstNumber % secondNumber;
                    System.out.println("The result is: "+modulus);
                }
            } else{
                System.err.println("Please choose between +, -, *, / or %");
            }
        
        
        

        input.close();
    }
}
