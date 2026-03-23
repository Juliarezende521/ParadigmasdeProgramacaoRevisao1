/*Modele o empréstimo de livros.
Classes: Leitor (id, nome) e Livro (id, titulo, autor).
Classe de Associação: Emprestimo. Deve conter a dataEmprestimo, a dataDevolucaoPrevista e o vínculo entre o Leitor e o Livro.
Regra: O método toString() do empréstimo deve mostrar os dados do leitor e o título do livro emprestado.*/

package classeassociacao.exe2;

public class Leitor{
    private String nome;
    private int id;

    //construtor vazio
    public Leitor(){
    }

    //construtor com instancias
    public Leitor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Leitor{" +
                " nome=" + nome +
                ", id=" + id +
                '}';
    }
}