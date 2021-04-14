
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

//import java.util.InputMismatchException;

public class Calculator {
    private static final Logger loggercls = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("****Calculator-DevOps, Choose to perform operation****");
            System.out.print("Press 1 to Factorial\nPress 2 to Square root\nPress 3 to Natural log\nPress 4 to power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Factorial option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial result is : " + calculator.Factorial(number1));
                    break;
                case 2:
                    System.out.println("Square root option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    if(number1<0)
                    {
                        number1=number1*-1;
                        double res=calculator.squareroot(number1);
                        System.out.println("Square root result is : " +"+"+ res+"i\n"+"-"+ res+"i");
                    }
                    else
                    {
                        double res=calculator.squareroot(number1);
                        System.out.println("Square root result is : "+"+" + res+"\n-"+res);
                    }
                    break;

                case 3:
                    System.out.println("natural log option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("naturallog: " + calculator.naturallog(number1));
                    break;
                case 4:
                    System.out.println("pow option chosen");
                    System.out.print("Enter the number 1: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the number 2: ");
                    number2 = scanner.nextDouble();
                    System.out.println("pow result is : " + calculator.powofnum(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double powofnum(double number1,double number2) {
        double result = 0;
        loggercls.info("Calculating power function of given numbers:" + number1+","+number2);
        loggercls.info("Resultant answer of power operation is : " + Math.pow(number1, number2));
        result = Math.pow(number1,number2);
        return result;
    }

    public double Factorial(double number1) {
        double result = 1;
        int i;
        loggercls.info("Calculating factorial  of given number:" + number1);
        if (number1 < 0||number1!=(int)number1)
            result = Double.NaN;
        else
            for (i = 1; i <= number1; i++) {
                result = result * i;
            }
        loggercls.info("Resultant answer of power operations is : " + result);
        return result;
    }

    public double naturallog(double number1) {
        loggercls.info("Calculating natural log  of given number:" + number1);
        loggercls.info("Resultant answer of natural log operation is : " + Math.log(number1));
        double result = 0;
        result = Math.log(number1);
        return result;
    }

    public double squareroot(double number1) {
        loggercls.info("Calculating square root  of given number:" + number1);
        loggercls.info("Resultant answer of power operations is : " + Math.sqrt(number1));
        double result = 0;
        result = Math.sqrt(number1);
        return result;
    }

}
