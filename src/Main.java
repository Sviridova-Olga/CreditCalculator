public class Main {
    public static void main(String[] args) {
        double creditAmount = 1_000_000;                 //Сумма кредита от 100_000 до 5_000_000
        double percent = 9.99;                          //процентная ставка >0
        int creditTimeYear = 1;                        //срок кредита в годах от 1 года до 3 лет
        CreditPaymentService service = new CreditPaymentService();
        int totalPayment = (int)service.calculate(creditAmount, percent, creditTimeYear);
        if (totalPayment != 0) {
            System.out.println("Ежемесячный платеж = " + totalPayment);
        } else {
            System.out.println("Входные параметры не соответствуют условиям");
        }
    }
}
