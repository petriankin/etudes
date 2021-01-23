package io.github.petriankin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePolishNotationCalculatorTest {

    @Test
    void whenCalculateSimpleExpressionsCalculatesCorrectly() {
        int additionResult = ReversePolishNotationCalculator.calculate("1 1 +");
        assertThat(additionResult).isEqualTo(2);

        int subtractionResult = ReversePolishNotationCalculator.calculate("12 5 -");
        assertThat(subtractionResult).isEqualTo(7);

        int divisionResult = ReversePolishNotationCalculator.calculate("120 3 /");
        assertThat(divisionResult).isEqualTo(40);

        int multiplicationResult = ReversePolishNotationCalculator.calculate("9 7 *");
        assertThat(multiplicationResult).isEqualTo(63);
    }

    @Test
    void whenCalculateComplexExpressionsCalculatesCorrectly() {
        int result = ReversePolishNotationCalculator.calculate("1 2 + 4 * 3 +");
        assertThat(result).isEqualTo(15);
    }

    @Test
    void whenInputIsNullZeroShouldBeReturned() {
        int result = ReversePolishNotationCalculator.calculate(null);
        assertThat(result).isEqualTo(0);
    }
}
