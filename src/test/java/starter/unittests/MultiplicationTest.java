package starter.unittests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import starter.Multiplication;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicationTest {
    @Test
    @DisplayName ("khi thực hiện nhân 2 số")
    void testMultiply() {
        //Given
        double num1 = 3;
        double num2 = 2;
        Multiplication mulAble = new Multiplication();
        //When
        double actualResult = mulAble.multiply(num1, num2);

        //Then
        assertEquals(6, actualResult);

    }
}
