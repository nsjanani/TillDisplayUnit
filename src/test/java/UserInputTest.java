import org.junit.Test;

import java.math.BigDecimal;

public class UserInputTest {

    UserInput userInput = new UserInput();

    @Test
    public void shouldNotAcceptPriceFor4DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.3434");
        assert !userInput.isPriceDecimalValid(price);
    }

    @Test
    public void shouldAcceptPriceFor2DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.33");
        assert userInput.isPriceDecimalValid(price);
    }

    @Test
    public void shouldNotAcceptPriceFor1DecimalPlaces() {
        BigDecimal price = new BigDecimal("23.3");
        assert !userInput.isPriceDecimalValid(price);
    }

    @Test
    public void shouldAcceptValidStatusCode() {
        String statusCode = "blah blah";
        assert !userInput.isStateCodeValid(statusCode);
    }

    @Test
    public void shouldNotAcceptInvalidStateCode() {
        String statusCode = "AL";
        assert userInput.isStateCodeValid(statusCode);
    }
}
