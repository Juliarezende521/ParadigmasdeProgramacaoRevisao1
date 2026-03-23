package classeassociacao.exe2;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Leitor leitor = new Leitor("Julia", 1);
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis");

        Emprestimo emp = new Emprestimo(
                java.time.LocalDateTime.now(),
                java.time.LocalDateTime.now().plusDays(7),
                leitor,
                livro
        );

        //encadeamento
        System.out.println(emp.getLeitor().getNome());
        System.out.println(emp.getLivro().getTitulo());
    }
}
