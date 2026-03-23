package classeassociacao.exe5;
/*Apenas Composição (Dependência Existencial)
Exercício 5: Computador e Seus Componentes
Classes: Processador (marca, modelo, frequencia) e Computador (id, marca).
Um Computador é composto por um Processador.
Regra: O processador deve ser instanciado dentro do construtor da classe Computador.
 Se o computador for deletado, o processador também deve ser.*/
public class Processador {
    private String marca, modelo;
    private double frequencia;

    public Processador(){
    }

    public Processador(String marca, String modelo, double frequencia){
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }


    @Override
    public String toString(){
        return "Processador{ " +
                "marca= " + marca +
                ", modelo= " + modelo +
                ", frequencia= " + frequencia +
                "}";
    }
}
