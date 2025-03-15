package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testPlus_validArgument_success() {
        // given:
        int a = 2;
        int b = 3;
        int expected = 5;
        // when:
        int result = calc.plus.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinus_validArgument_success() {
        // given:
        int a = 5;
        int b = 3;
        int expected = 2;
        // when:
        int result = calc.minus.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply_validArgument_success() {
        // given:
        int a = 4;
        int b = 3;
        int expected = 12;
        // when:
        int result = calc.multiply.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivide_validArgument_success() {
        // given:
        int a = 10;
        int b = 2;
        int expected = 5;
        // when:
        int result = calc.devide.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivide_divideByZero_throwsException() {
        // given:
        int a = 10;
        int b = 0;
        // when & then:
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.devide.apply(a, b);
        });
    }

    @Test
    public void testPow_validArgument_success() {
        // given:
        int a = 3;
        int expected = 9;
        // when:
        int result = calc.pow.apply(a);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAbs_validArgument_success() {
        // given:
        int a = -5;
        int expected = 5;
        // when:
        int result = calc.abs.apply(a);
        // then:
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testIsPositive_validArgument_success() {

        int elixirOfEternalSunshine = -10;

        boolean manifestationOfCosmicJoy = !calc.isPositive.test(elixirOfEternalSunshine);

        Assertions.assertFalse(!manifestationOfCosmicJoy, "Да да я просто так дважды перевернул бул. Перевернул бы и " +
                "трижды но не понял как :) ");
    }
}
