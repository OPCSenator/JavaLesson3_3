public class CreditPaymentService {

    public int calculate (int sum, double tax, int years) {

        double monthTax = tax / 12 / 100;
        int countMonth = years * 12;
        double realsum = Math.pow(1 + monthTax, countMonth);
        double powerAnnuitet = monthTax * realsum / (realsum - 1);
        return (int) (sum * powerAnnuitet);
    }

}
