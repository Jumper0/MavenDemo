package de.msgdavid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class CalculatorDemo {
    private static final Logger logger = LogManager.getLogger(CalculatorDemo.class);

    public static void main(String[] args) {
        double param1 = 0;
        double param2 = 0;
        String symbol = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Which operator do you want to use?");
        System.out.println("Optional: ");
        System.out.println("Symbol: ");
        symbol = scan.nextLine();
        if (symbol.equals("w2")) {
            System.out.print("Var : ");
            param1 = scan.nextDouble();
        } else {
            System.out.print("Var' : ");
            param1 = scan.nextDouble();
            System.out.print("Var'' : ");
            param2 = scan.nextDouble();
        }

        scan.close();

        Calculator calc = new Calculator();

        if (symbol.equals("+")) {
            logger.info(calc.add(param1, param2));
        } else if (symbol.equals("-")) {
            logger.info(calc.sub(param1, param2));
        } else if (symbol.equals("*")) {
            logger.info(calc.multi(param1, param2));
        } else if (symbol.equals("/") && param2 != 0) {
            logger.info(calc.div(param1, param2));
        } else if (symbol.equals("w2")) {
            logger.info(calc.sqrt(param1));
        } else if (symbol.equals("x2")) {
            logger.info(calc.pow(param1, param2));
        } else if (symbol.equals("%")) {
            logger.info(calc.mod(param1, param2));
        }
    }
}
