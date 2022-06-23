package test;

import java.util.*;

public class GenerateRandomWord {
    public static void main(String[] args) {
       // System.out.println("vish");
      //  Scanner scn = new Scanner(System.in);
     //   String scn1 = scn.nextLine();
      //  System.out.println(scn1);
        System.out.println("pergunta aleatoria");
        List<String> Words = Arrays.asList("Sim", "Não", "Talvez");
        Collections.shuffle(Words);
        //char letters = scn.next().charAt(0); // traz o caractere da posição 0
        System.out.println("_________");
        System.out.println(Words.get(0));
    }

}
