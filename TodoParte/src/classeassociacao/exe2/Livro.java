/*Modele o empréstimo de livros.
Classes: Leitor (id, nome) e Livro (id, titulo, autor).
Classe de Associação: Emprestimo. Deve conter a dataEmprestimo, a dataDevolucaoPrevista e o vínculo entre o Leitor e o Livro.
Regra: O método toString() do empréstimo deve mostrar os dados do leitor e o título do livro emprestado.*/

package classeassociacao.exe2;

public class Livro{
    private int id;
    private String titulo, autor;

    public Livro(){
    };

    public Livro(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "Livro{" +
                ", id=" + id +
                ", titulo=" + titulo +
                ", autor=" + autor +
                "}";
    }
}