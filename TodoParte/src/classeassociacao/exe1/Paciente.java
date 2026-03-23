/*Crie um sistema para gerenciar consultas.
 Classes: Medico (id, nome, especialidade) e Paciente (id, nome, cpf).
 Classe de Associação: Consulta. Ela deve conter a Data (use LocalDateTime), o ValorDaConsulta e as referências para o Médico e o Paciente.
 Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */

package classeassociacao.exe1;

// objeto-parte
public class Paciente {
    private String nome, cpf;
    private int id;

    public Paciente() {
    }
    public Paciente(int id, String nome, String cpf ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                "id=" + id + '\'' +
                '}';
    }
}
