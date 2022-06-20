package test;

public class Blocos {
    private  String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco");
    }
    static {
        System.out.println("Dentro do bloco g");
    }
    static {
        System.out.println("Dentro do bloco h ");
    }
//    public Blocos() {
    static {
    System.out.println("Dentro do bloco1");
        episodios = new int[100];
        for (int i =0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    {
        System.out.println("non static");
    }


        for (int episodio: Blocos.episodios){
            System.out.print(episodio + " ");
        }
    }
}
