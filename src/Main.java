public class Main {

    public static void main(String[] args) {

        int creditsum = 1_000_000;
        int countYears = 3;
        double tax = 9.99;

        CreditPaymentService service = new CreditPaymentService();

        double monthPay = service.calculate(creditsum, tax, countYears);

        System.out.println("ежемесячный платеж: " + monthPay);
    }
}