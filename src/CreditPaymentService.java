public class CreditPaymentService {

    public double calculate (int sum, double tax, int years) {

        double monthTax = tax / 12;
        int countMonth = years * 12;
        double realsum = Math.pow(1 + monthTax, countMonth);
        double powerAnnuitet = monthTax * realsum / (realsum - 1);
        return sum * powerAnnuitet;
    }

}
