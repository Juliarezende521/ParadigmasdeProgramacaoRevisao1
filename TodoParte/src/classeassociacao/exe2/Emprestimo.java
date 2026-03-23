/*
Classe de Associação: Emprestimo. Deve conter a dataEmprestimo, a dataDevolucaoPrevista e o vínculo entre o Leitor e o Livro.
Regra: O método toString() do empréstimo deve mostrar os dados do leitor e o título do livro emprestado.*/

package classeassociacao.exe2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return "Emprestimo{" +
                "leitor=" + leitor.getNome() +
                ", livro='" + livro.getTitulo() + '\'' +
                ", dataEmprestimo=" + dataEmprestimo.format(formatoBR) +
                ", devolucaoPrevista=" + dataDevolucaoPrevista.format(formatoBR) +
                '}';
    }
}