package TesteParaSubir;

import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {
        System.out.println("su salareo: ");
        Scanner sca = new Scanner(System.in);
        double salario = sca.nextDouble();
        String sim = "ok";
        String nao = "non ok";
        String result = salario > 5000 ? sim : nao;
        System.out.println(result);
    }
}
