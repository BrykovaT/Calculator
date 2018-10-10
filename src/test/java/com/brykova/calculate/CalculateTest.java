package com.brykova.calculate;

import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class CalculateTest {

    private final BigDecimal param1 = new BigDecimal(10);
    private final BigDecimal param2 = new BigDecimal(12);

    @Test
    public void calcPlus() throws Exception {
        BigDecimal expected = new BigDecimal(22);
        BigDecimal actual = Calculate.calc(param1, param2, '+');
        assertEquals(expected, actual);
    }

    @Test
    public void calcMinus() throws Exception {
        BigDecimal expected = new BigDecimal(-2);
        BigDecimal actual = Calculate.calc(param1, param2, '-');
        assertEquals(expected, actual);
    }
    @Test
    public void calcMult() throws Exception {
        BigDecimal expected = new BigDecimal(120);
        BigDecimal actual = Calculate.calc(param1, param2, '*');
        assertEquals(expected, actual);
    }
    @Test
    public void calcDiv() throws Exception {
        BigDecimal expected = new BigDecimal("0.8333");
        BigDecimal actual= Calculate.calc(param1, param2, '/');
        assertEquals(expected,actual);
    }
}