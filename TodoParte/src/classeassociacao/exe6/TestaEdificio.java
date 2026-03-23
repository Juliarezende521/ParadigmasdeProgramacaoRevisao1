package classeassociacao.exe6;

public class TestaEdificio {
    public static void main(String[] args){
        // Criando o edifício
        Edificio edificio = new Edificio("Residencial Sol", "Rua das Flores");

        // Construindo apartamentos
        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(202, 2);
        edificio.construirApartamento(303, 3);

        // Mostrando o edifício
        System.out.println("Dados do edifício:");
        System.out.println(edificio);

        // "Deletando" o edifício
        edificio = null;

        System.out.println("\nEdifício foi anulado.");
    }
}
