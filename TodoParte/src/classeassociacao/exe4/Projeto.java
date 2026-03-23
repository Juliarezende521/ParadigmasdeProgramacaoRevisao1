package classeassociacao.exe4;
import java.util.ArrayList;
/*Projeto de Software
Classes: Programador (id, nome, linguagemPrincipal) e Projeto (id, nomeProjeto).
O Projeto agrega vários programadores.
Regra: Crie um método para listar todos os programadores que estão trabalhando naquele projeto específico.*/

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(){
    }

    public Projeto(int id, String nomeProjeto){
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        programadores = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNomeProjeto(){
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
    }

    public void agregarProgramador( Programador programador){
        programadores.add(programador);
    }

    public String toString(){
        return "Projeto {" +
                "id= " + id +
                ", nomeProjeto= " + nomeProjeto+
                ", programadores= " + programadores +
                "}";
    }

}
