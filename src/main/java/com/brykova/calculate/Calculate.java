package com.brykova.calculate;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculate {

    private static Scanner keyboard = new Scanner(System.in);

    public static BigDecimal getNum() {

        System.out.print("Number:");
        BigDecimal result;
        try {
            result = keyboard.nextBigDecimal();
        } catch (Exception ex) {
            keyboard.nextLine();
            System.out.println("Wrong number.Try again.");
            result = getNum();
        }
        return result;
    }

    public static char getSymbol() {
        System.out.print("Operation(+ - * /): ");
        char symbol = keyboard.next().charAt(0);
        char result;
        if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
            result = symbol;
        } else {
            System.out.println("Wrong operation.Try again.");
            result = getSymbol();
        }
        return result;
    }

    public static BigDecimal calc(BigDecimal num1, BigDecimal num2, char symbol) {
        BigDecimal result;
        switch (symbol) {
            case '+':
                result = num1.add(num2);
                break;
            case '-':
                result = num1.subtract(num2);
                break;
            case '*':
                result = num1.multiply(num2);
                break;
            case '/':
                result = num1.divide(num2, 4, BigDecimal.ROUND_HALF_UP);
                break;
            default:
                System.out.println("Operation is not allowed");
                result = calc(num1, num2, symbol);
        }
        return result;
    }
}
