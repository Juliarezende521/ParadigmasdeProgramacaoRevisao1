package classeassociacao.exe8;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args){

        // Criando filmes (AGREGAÇÃO)
        Filme f1 = new Filme(1, "Batman", "Ação", 120);
        Filme f2 = new Filme(2, "Duna", "Ficção", 150);

        // Criando sessão
        LocalDateTime data = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, data, 1);

        // Vinculando filme (AGREGAÇÃO)
        sessao.vincularFilme(f1);

        // Vendendo ingressos (COMPOSIÇÃO)
        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);

        // Exibindo dados
        System.out.println("Dados da sessão:");
        System.out.println(sessao);
    }
}
