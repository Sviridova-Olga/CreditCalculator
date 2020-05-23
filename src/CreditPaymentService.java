public class CreditPaymentService {
    public double calculate (double creditAmount, double percent, int creditTime){
        double totalPayment = 0;
        if (creditAmount >= 100000 && creditAmount <= 5000000 && creditTime >= 12 && creditTime <= 36 && percent>0) {
            double monthPercent = Math.pow((1 + percent / 12 / 100), creditTime);
            double annuityRatio = (percent / 12 / 100 * (monthPercent)) / (monthPercent - 1);  //коэф. аннуитета
            totalPayment = Math.round(creditAmount * annuityRatio * 100);
            totalPayment = totalPayment / 100;                                           //Ежемесячный платеж
        } else {
           totalPayment = 0;
        }
        return totalPayment;
    }
    public double overPayment (double creditAmount, int creditTime, double totalPayment) {
        double overPay = Math.round((totalPayment*creditTime - creditAmount)*100);
        return  overPay/100;
    }
}

