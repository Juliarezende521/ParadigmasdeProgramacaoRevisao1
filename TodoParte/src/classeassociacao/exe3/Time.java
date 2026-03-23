package classeassociacao.exe3;
import java.util.ArrayList;
/*Exercício 3: Time de Basquete (Inspirado no Franca Basquete)
Classes: Atleta (id, nome, posicao) e Time (id, nome, tecnico).
O Time possui um ArrayList<Atleta>.
Regra: Implemente o método void contratarAtleta(Atleta a). No main, prove que se o objeto Time for anulado, o objeto Atleta continua existindo.
*/
public class Time{
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> atletas;


    public Time(){
        atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico){
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        atletas = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTecnico(){
        return tecnico;
    }

    public void setTecnico(String tecnico){
        this.tecnico = tecnico;
    }

    public void contratarAtleta(Atleta a){
        atletas.add(a);
    }

    public String toString(){
        return "Time{" +
                " id= " + id +
                ", nome= " + nome +
                ", tecnico= " + tecnico +
                ", atletas= " + atletas +
                "}";
    }
}
