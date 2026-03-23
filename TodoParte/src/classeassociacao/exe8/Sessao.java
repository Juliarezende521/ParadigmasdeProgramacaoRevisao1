package classeassociacao.exe8;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    private Filme filme; // agregação
    private ArrayList<Ingresso> ingressos; // composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // AGREGAÇÃO
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // COMPOSIÇÃO
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}