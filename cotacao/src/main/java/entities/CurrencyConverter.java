package entities;
/*
     cotacaoDolar → dollarRate (represents the exchange rate).
     vlrCompraDolar → dollarAmount (represents the amount in dollars).
     calcularValorEmReais → calculateAmountInReais (method for calculating the final amount in Brazilian reais).
     valorEmReais → amountInReais
     vlrApagarComIof → amountWithIof

 */
public class CurrencyConverter {
    private final double dollarRate;
    private final double dollarAmount;
    private static final double IOF = 0.06;

    public CurrencyConverter(double dollarRate, double dollarAmount) {
        this.dollarRate = dollarRate;
        this.dollarAmount = dollarAmount;
    }

    public double calculateAmountInReais(){
        double amountInReais = dollarRate * dollarAmount;
        double amountWithIof = amountInReais * (1 +IOF );
        return amountWithIof;
    }
}
