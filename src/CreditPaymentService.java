public class CreditPaymentService {
    public double calculate(double creditAmount, double percent, int creditTime) {
        double totalPayment;
        if (creditAmount >= 100000 && creditAmount <= 5000000 && creditTime > 0 && percent > 0) {
            double monthPercent = Math.pow((1 + percent / 12 / 100), creditTime);
            double annuityRatio = (percent / 12 / 100 * (monthPercent)) / (monthPercent - 1);  //коэф. аннуитета
            totalPayment = Math.round(creditAmount * annuityRatio);                            //Ежемесячный платеж
        } else {
            totalPayment = 0;
        }
        return totalPayment;
    }
}
