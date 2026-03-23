package classeassociacao.exe6;
/*Classes: Apartamento (numero, andar) e Edificio (nome, endereco).
O Edificio possui um ArrayList<Apartamento>.
Regra: Implemente o método void construirApartamento(int num, int andar). Os dados do apartamento são passados como tipos primitivos, e o objeto é criado dentro do Edifício.
*/
public class Apartamento {
    private int numero, andar;

    public Apartamento(){
    }

    public Apartamento(int numero, int andar){
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAndar(){
        return andar;
    }

    public void setAndar(int andar){
        this.andar = andar;
    }

    public String toString(){
        return "Apartamento{" +
                "numero= " + numero +
                ", andar= " + andar +
                "}";
    }
}
