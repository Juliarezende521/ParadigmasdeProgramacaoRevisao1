package classeassociacao.exe6;
import java.util.ArrayList;
/*Classes: Apartamento (numero, andar) e Edificio (nome, endereco).
O Edificio possui um ArrayList<Apartamento>.
Regra: Implemente o método void construirApartamento(int num, int andar).
Os dados do apartamento são passados como tipos primitivos, e o objeto é criado dentro do Edifício.
*/
public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(){
        apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        apartamentos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void construirApartamento(int num, int andar){
        Apartamento ap = new Apartamento(num, andar);
        apartamentos.add(ap);
    }

    public String toString(){
        return "Edifício{" +
                " nome= " + nome +
                ", endereço= " + endereco +
                ", apartamentos= " + apartamentos +
                "}";
    }

}
