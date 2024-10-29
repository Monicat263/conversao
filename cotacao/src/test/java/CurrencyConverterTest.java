import entities.CurrencyConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrencyConverterTest {

    @Test
    @DisplayName("Calcula conversão de dolar em reais considerando IOF")
    public void testCalculatAmountInReaisWithIof() {
        double dollarRate = 5.00;
        double dollarAmount = 100;

        CurrencyConverter converter = new CurrencyConverter(dollarRate,dollarAmount);

        double expectedAmount = dollarRate * dollarAmount * 1.06;
        double actualAmount = converter.calculateAmountInReais();

        // delta de 0.1 margem de erro (tolerância) ao comparar números de ponto flutuante
        assertEquals(expectedAmount,actualAmount,0.1);

    }

    @Test
    @DisplayName("Calcula conversão de dolar em reais sem considerar o IOF")
    public void testCalculateAmountInReaisWithoutIOF() {
        double dollarRate = 8.00;
        double dollarAmount = 100;

        CurrencyConverter converter = new CurrencyConverter(dollarRate,dollarAmount);

        double expectedAmount = dollarRate * dollarAmount;
        double actualAmount = converter.calculateAmountInReais();

        // delta de 0.1 margem de erro (tolerância) ao comparar números de ponto flutuante
        assertEquals(expectedAmount,actualAmount, 0.1);

    }
}
