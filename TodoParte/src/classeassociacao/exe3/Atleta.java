package classeassociacao.exe3;
/*Exercício 3: Time de Basquete (Inspirado no Franca Basquete)
Classes: Atleta (id, nome, posicao) e Time (id, nome, tecnico).
O Time possui um ArrayList<Atleta>.
Regra: Implemente o método void contratarAtleta(Atleta a). No main, prove que se o objeto Time for anulado, o objeto Atleta continua existindo.
*/
public class Atleta {
    private int id;
    private String nome, posicao;

    public Atleta(){
    }

    public Atleta(int id, String posicao, String nome){
        this.id = id;
        this.posicao = posicao;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPosicao(){
        return posicao;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Atleta{" +
                " id= " + id +
                ", posicao= "+ posicao +
                ", nome= "+ nome +
                "}";
    }
}

