package classeassociacao.exe5;

public class TestaComputador {
    public static void main(String[] args){
        Computador c = new Computador(1, "Dell", "Intel", "i7", 3.5);

        System.out.println("Antes de deletar:");
        System.out.println(c);

        c = null;
        System.out.println("\n O computador foi anulado.");



    }
}
