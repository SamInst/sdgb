package TestToUp;

import ClientTest.ClientType;

public class Cleint {
    public enum PaymentType{
        DEBIT{
            @Override
            public double CalculateDiscount(double valor) {
                return valor - (valor * 0.1);

            }
        },
        CREDIT {
            @Override
            public double CalculateDiscount(double valor) {
                return valor - (valor * 0.05);
            }
        };
        public double CalculateDiscount(double valor){
            return 0;
        }
    }
    private String name;
    private ClientType Client_Type;
    private PaymentType paymentType;

    public Cleint(String name, ClientType client_Type, PaymentType paymentType) {
        this.name = name;
        Client_Type = client_Type;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Cleint{" +
                "name='" + name + '\'' +
                ", Client_Type=" + Client_Type +
                ", paymentType=" + paymentType +
                '}';
    }
}
