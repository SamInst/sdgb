package Teste;

import java.util.Scanner;

public class MeasureInch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float inch=0.0254f;
        double valor = x*inch;
        String a = " inch is ";
        System.out.println(x+a+(String.format("%.1f",valor)+" meters"));
    }
}
