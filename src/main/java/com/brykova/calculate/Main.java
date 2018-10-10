package com.brykova.calculate;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.brykova.calculate.Calculate.getNum;
import static com.brykova.calculate.Calculate.getSymbol;

public class Main{

    public static void main(String[] args) {
        BigDecimal result = Calculate.calc(getNum(), getNum(), getSymbol());
        System.out.println("Result "+ result);
    }



}
