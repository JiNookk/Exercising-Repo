import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorFetchTest {
    @Test
    void simple(){
        CalculatorFetch calculatorFetch = new CalculatorFetch();

        assertEquals(0, calculatorFetch.compute("0 + 0"));
        assertEquals(1, calculatorFetch.compute("1 + 0"));
        assertEquals(2, calculatorFetch.compute("2 + 0"));
        assertEquals(2, calculatorFetch.compute("1 + 1"));
    }

}