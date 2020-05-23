public class CreditPaymentService {
    public double calculate (double creditAmount, double percent, int creditTimeYear){
        int creditTime = creditTimeYear*12;
        double totalPayment = 0;
        boolean time = false;
        if (creditTime == 12 || creditTime == 24 || creditTime == 36) {time = true;}
        if (creditAmount >= 100000 && creditAmount <= 5000000 && time == true && percent>0) {
            double monthPercent = Math.pow((1 + percent / 12 / 100), creditTime);
            double annuityRatio = (percent / 12 / 100 * (monthPercent)) / (monthPercent - 1);  //коэф. аннуитета
            totalPayment = Math.round(creditAmount * annuityRatio);                            //Ежемесячный платеж
        } else {
           totalPayment = 0;
        }
        return totalPayment;
    }
}
