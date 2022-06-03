package TesteParaSubir;

import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        int idade;
        String cat = null;
        do {
        System.out.println("idade: ");
        Scanner scsa = new Scanner(System.in);
        idade = scsa.nextInt();
            if (idade <= 1) {
                cat="recen nascido";}
            if (idade > 1 && idade<=11) {
                cat="Infantil";}
            if (idade >= 12 && idade <= 14) {
                cat = "pre adolescente";
            } else if (idade >= 15 && idade < 18) {
                cat="adolescente";
            } else if (idade >= 18 && idade <= 40) {
                cat="Adults";
            } else if (idade > 40){
                cat="Velhos";}
            System.out.println(cat);
        } while (idade !=0);
    }
}
