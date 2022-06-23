package MoreTests;

import java.util.Scanner;
public class Call {
    public static void soma(){
        System.out.println(100+100);
    }
    public static void sub (){
        System.out.println(200-50);
    }
    public static void dollar() {
        System.out.println("Valor em reais: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float dolar = x/4.75F, euro= x/5.03F, yene= x/0.037F;
        System.out.println("Cotações: \nDólar $" + dolar + "\nEuro: €" + euro + "\nYene: ¥" + yene);
    }
    public static void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
