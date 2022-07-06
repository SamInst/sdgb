package Exceptions;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println(divisao(0,0));
    }
    public static int divisao (int a, int b){
        if (b==0){throw new RuntimeException("ERRU");}
        try {
            return  a/b;
        }catch (RuntimeException e){e.printStackTrace();}
        return 0;
    }
    }


