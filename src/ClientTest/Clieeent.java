package ClientTest;
import TestToUp.Cleint;
public class Clieeent {
    public static void main(String[] args) {
        Cleint c1 = new Cleint("tsubasa",ClientType.PHYSICS_PERSON, Cleint.PaymentType.CREDIT);
        Cleint c2 = new Cleint("tsubasa2", ClientType.LEGAL_PERSON, Cleint.PaymentType.DEBIT);
        Cleint c3 = new Cleint("tsubasa3",ClientType.PHYSICS_PERSON, Cleint.PaymentType.CREDIT);
        Cleint c4 = new Cleint("tsubasa4",ClientType.LEGAL_PERSON, Cleint.PaymentType.DEBIT);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(Cleint.PaymentType.CREDIT.CalculateDiscount(100));
        System.out.println(Cleint.PaymentType.DEBIT.CalculateDiscount(100));
    }
}
