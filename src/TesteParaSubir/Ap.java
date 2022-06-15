package TesteParaSubir;

public class Ap {
    public static void main(String[] args) {
//        System.out.println("kkkkkkkkkkkkkkkkk");
        //---------____-------_____------_______------____-----____-------___-------____-----____-------____------____----

//        double valo= 30000;
//
//        for (int parcela = 1; parcela <= valo; parcela++){
//            double valorParc = valo/parcela;
//            if(valorParc<1000){
//                continue;
//            }
//            System.out.println(parcela + " parcelas de "+ " R$ "+valorParc);
//        }
        //_____________________________________________------------------------_____________-----------________----____-------
        // int count = 0;
//    if(i % 10 == 0)
//    System.out.println("contagem: "+i);


//for (int i = 0; i <= 1000; i++){
//    if(i % 10 == 0)
//    System.out.println("contagem: "+i);
//};
//        while (count<10){
//            System.out.println(++count);
        //}

        //---------------------------------------------------------------------------------------------------------------------

//        int[][] idades = new int[3][3];
//        idades[0][0] = 21;
//        idades[0][1] = 22;
//        idades[0][2] = 23;
//
//        idades[1][0] = 24;
//        idades[1][1] = 25;
//        idades[1][2] = 26;
//
//        idades[2][0] = 27;
//        idades[2][1] = 28;
//        idades[2][2] = 29;
//
//        for (int i = 0; i< idades.length ; i++) {
//            for (int j = 0; j < idades[0].length;j++)
//            System.out.println(idades[i][j]);
//        }

        System.out.println("----------------------");
// mesma coisa dos i e j lá em cima ^
//        for (int[] arrBase: idades){
//            for (int num: arrBase){
//                System.out.println(num);
//            }
//        }
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[5];
        arrayInt[1] = new int[10];
        arrayInt[2] = new int[15];

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n_________");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("------------------");
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};
        //System.out.print("ui"+arrayInt2);

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n_________");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
//        String[] nomes = new String[4];
//        nomes[0] = "sam";
//        nomes[1] = "sama";
//        nomes[2] = "samaa";
//        //nomes[3] = "samaadfdf";
//
//        for (int a = 0; a < nomes.length; a++) {
//            System.out.println(nomes[a]);
        //______________-------____--------_____----____-----____-----____-----_____-----____-------____------_____------___-----___--


        //}
    }
}


