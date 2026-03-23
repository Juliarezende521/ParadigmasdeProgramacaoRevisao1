package classeassociacao.exe3;

public class TestaTime {
    public static void main(String[] args){
// Criando atletas
        Atleta a1 = new Atleta(1, "Lucas", "Armador");
        Atleta a2 = new Atleta(2, "João", "Pivô");

        // Criando time
        Time time = new Time(10, "Franca Basquete", "Helinho");

        // Contratando atletas
        time.contratarAtleta(a1);
        time.contratarAtleta(a2);

        // Mostrando o time
        System.out.println("Time antes de ser anulado:");
        System.out.println(time);

        // Anulando o time
        time = null;

        // Provando que o atleta continua existindo
        System.out.println("\nAtleta ainda existe após o time ser null:");
        System.out.println(a1);
    }
}
