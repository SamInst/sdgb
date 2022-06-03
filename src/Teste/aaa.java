package Teste;
import java.util.Scanner;
public class aaa {
    public static void main(String[] args) {
        System.out.println("Valor em reais: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float dolar = x/4.75F, euro= x/5.03F, yene= x/0.037F;
        System.out.println("Cotações: \nDólar $" + dolar + "\nEuro: €" + euro + "\nYene: ¥" + yene);
    }
}

