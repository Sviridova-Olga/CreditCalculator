public class Main {
    public static void main(String[] args) {
        double creditAmount = 300000;              //Сумма кредита от 100_000 до 5_000_000
        double percent = 18.5;                      //процентная ставка >0
        int creditTime = 12;                        //срок кредита в месяцах от 1 года до 3
        CreditPaymentService service = new CreditPaymentService();
        double totalPayment = service.calculate(creditAmount, percent, creditTime);
        if (totalPayment != 0) {
            double overPay = service.overPayment(creditAmount, creditTime, totalPayment);
            System.out.println("Ежемесячный платеж = " + totalPayment);
            System.out.println("Сумма переплаты = " + overPay);
        } else {
            System.out.println("Входные параметры не соответствуют условиям");
        }


    }
}
