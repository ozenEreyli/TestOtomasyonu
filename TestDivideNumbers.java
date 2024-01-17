import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {

    @Test
    public void testDivideNumbers() {
        try {
            // Test case 1: Geçerli bir bölme durumu :)
            int result1 = DivisionCalculator.divideNumbers(10, 2);
            assertEquals(5, result1);

            // Test case 2: Sıfıra bölme girişimi durumu :)
            assertThrows(DivisionCalculator.DivideByZeroException.class, () -> {
                DivisionCalculator.divideNumbers(5, 0);
            });

            // Test case 3: Sonucun negatif olma durumu :)
            assertThrows(DivisionCalculator.NegativeResultException.class, () -> {
                DivisionCalculator.divideNumbers(10, -2);
            });

        } catch (Exception e) {
            fail("Beklenmedik istisna: " + e.getMessage());
        }
    }
}
