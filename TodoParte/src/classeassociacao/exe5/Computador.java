package classeassociacao.exe5;
/*Apenas Composição (Dependência Existencial)
Exercício 5: Computador e Seus Componentes
Classes: Processador (marca, modelo, frequencia) e Computador (id, marca).
Um Computador é composto por um Processador.
Regra: O processador deve ser instanciado dentro do construtor da classe Computador.
 Se o computador for deletado, o processador também deve ser.*/

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(){
    }

    public Computador(int id, String marca, String marcaProc, String modeloProc, double frequencia){
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, frequencia);
    }

    @Override
    public String toString(){
        return "Computador{" +
                " id= " + id +
                ", marca= " + marca +
                ", processador= " + processador +
                "}";
    }
}
