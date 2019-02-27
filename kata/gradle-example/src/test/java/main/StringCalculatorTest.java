package main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void string_o_should_return_0() {

         StringCalculator calc =  new StringCalculator ();
        int sum = calc.calculatorString("0");

        Assert.assertEquals( sum , 0);

    }


    @Test
    public void string_1_and_2_should_return_3() {
        StringCalculator calc =  new StringCalculator();
        int sum = calc.calculatorString("1,2");
        Assert.assertEquals( sum , 3);
    }

    @Test
    public void string_1_2_3_should_return_6() {
        StringCalculator calc =  new StringCalculator();
        int sum = calc.calculatorString("1,2,3");
        Assert.assertEquals( sum , 6);
    }


}