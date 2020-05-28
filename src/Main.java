public class Main {
    public static void main(String[] args) {
        double creditAmount = 1_000_000;                           //Сумма кредита от 100_000 до 5_000_000
        double percent = 9.99;                                    //процентная ставка >0
        int totalPayment;
        CreditPaymentService service = new CreditPaymentService();

        totalPayment = (int) service.calculate(creditAmount, percent, 12);
        if (totalPayment != 0) {
            System.out.println("Ежемесячный платеж = " + totalPayment);
        } else {
            System.out.println("Входные параметры не соответствуют условиям");
        }

        totalPayment = (int) service.calculate(creditAmount, percent, 24);
        if (totalPayment != 0) {
            System.out.println("Ежемесячный платеж = " + totalPayment);
        } else {
            System.out.println("Входные параметры не соответствуют условиям");
        }

        totalPayment = (int) service.calculate(creditAmount, percent, 36);
        if (totalPayment != 0) {
            System.out.println("Ежемесячный платеж = " + totalPayment);
        } else {
            System.out.println("Входные параметры не соответствуют условиям");
        }
    }
}

