package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateLotoEasyNumbers {
    public static void main(String[] args) {
        System.out.println("pergunta aleatoria");
        List<Integer> Numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
        Collections.shuffle(Numbers);
        System.out.println("_________");
        int order =  Numbers.get(0)+  Numbers.get(1)+ Numbers.get(2)+ Numbers.get(3)+ Numbers.get(4)+ Numbers.get(5)
                + Numbers.get(6)+ Numbers.get(7)+ Numbers.get(8)+ Numbers.get(9)+ Numbers.get(10)+ Numbers.get(11)+ Numbers.get(12)
                + Numbers.get(13)+ Numbers.get(14);
//        Collections.sort(order);
        System.out.println(order);


    }
}
