package TesteParaSubir;

import MaisTestes.Pessoa;

public class MaisPessoa2 {
    public static void main(String[] args) {
        MaisPessoa pessoa = new MaisPessoa();
        pessoa.setNome("Saam");
        pessoa.setIdade(22);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
