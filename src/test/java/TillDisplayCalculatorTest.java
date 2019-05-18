import org.junit.Test;

import java.math.BigDecimal;

public class TillDisplayCalculatorTest {

    TillDisplayCalculator tillDisplayCalculator = new TillDisplayCalculator();

    @Test
    public void shouldNotAcceptPriceFor4DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.3434");
        assert !tillDisplayCalculator.isPriceDecimalValid(price);
    }

    @Test
    public void shouldAcceptPriceFor2DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.33");
        assert tillDisplayCalculator.isPriceDecimalValid(price);
    }

    @Test
    public void shouldNotAcceptPriceFor1DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.3");
        assert !tillDisplayCalculator.isPriceDecimalValid(price);
    }
}
