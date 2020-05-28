public class Main {
    public static void main(String[] args) {
        double creditAmount = 1_000_000;                           //Сумма кредита от 100_000 до 5_000_000
        double percent = 9.99;                                    //процентная ставка >0
        int[] creditTime = {12, 24, 36};                        //срок кредита в месяцах > 0
        CreditPaymentService service = new CreditPaymentService();

        for (int i = 0; i < creditTime.length; i++) {
            int time = creditTime[i];
            int totalPayment = (int) service.calculate(creditAmount, percent, time);
            if (totalPayment != 0) {
                System.out.println("Ежемесячный платеж = " + totalPayment);
            } else {
                System.out.println("Входные параметры не соответствуют условиям");
            }

        }
    }
}
