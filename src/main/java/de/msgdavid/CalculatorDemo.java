package de.msgdavid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class CalculatorDemo {
    private static final Logger logger = LogManager.getLogger(CalculatorDemo.class);

    public static void main(String[] args) {
        double param1 = 0;
        double param2 = 0;
        String operator = "";

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("- - - - - | Start | - - - - -");
        System.out.println(" ");
        System.out.println("Which operator do you want to use?");
        System.out.println(" ");
        System.out.println("- - - - - | Options | - - - - -");
        System.out.println(" ");
        System.out.println("Add: +");
        System.out.println("Subtract: -");
        System.out.println("Multiply: *");
        System.out.println("Divide: /");
        System.out.println("Square root: r2");
        System.out.println("Square: xn");
        System.out.println("Modulo: %");
        System.out.println(" ");
        System.out.println("- - - - - | Input | - - - - -");
        System.out.println(" ");
        System.out.print("Operator: ");
        operator = scan.nextLine();

        if (operator.equals("+")) {
            System.out.print("Summand: ");
            param1 = scan.nextDouble();
            System.out.print("Summand: ");
            param2 = scan.nextDouble();
        } else if (operator.equals("-")) {
            System.out.print("Minuend: ");
            param1 = scan.nextDouble();
            System.out.print("Subtrahend: ");
            param2 = scan.nextDouble();
        } else if (operator.equals("*")) {
            System.out.print("Faktor: ");
            param1 = scan.nextDouble();
            System.out.print("Faktor: ");
            param2 = scan.nextDouble();
        } else if (operator.equals("/")) {
            System.out.print("Dividend: ");
            param1 = scan.nextDouble();
            System.out.print("Divisor: ");
            param2 = scan.nextDouble();
        } else if (operator.equals("r2")) {
            System.out.print("Radikant: ");
            param1 = scan.nextDouble();
        } else if (operator.equals("xn")) {
            System.out.print("Basis: ");
            param1 = scan.nextDouble();
            System.out.print("Exponent: ");
            param2 = scan.nextDouble();
        } else if (operator.equals("%")) {
            System.out.print("Dividend: ");
            param1 = scan.nextDouble();
            System.out.print("Divisor: ");
            param2 = scan.nextDouble();
        }

        System.out.println(" ");
        System.out.println("- - - - - | Output | - - - - -");
        System.out.println(" ");

        scan.close();

        Calculator calc = new Calculator();

        if (operator.equals("+")) {
            logger.info(calc.add(param1, param2));
        } else if (operator.equals("-")) {
            logger.info(calc.sub(param1, param2));
        } else if (operator.equals("*")) {
            logger.info(calc.multi(param1, param2));
        } else if (operator.equals("/") && param2 != 0) {
            logger.info(calc.div(param1, param2));
        } else if (operator.equals("r2")) {
            logger.info(calc.sqrt(param1));
        } else if (operator.equals("xn")) {
            logger.info(calc.pow(param1, param2));
        } else if (operator.equals("%")) {
            logger.info(calc.mod(param1, param2));
        }

        System.out.println(" ");
        System.out.println("- - - - - | End | - - - - -");
    }
}
