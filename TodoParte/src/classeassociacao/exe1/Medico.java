/*Crie um sistema para gerenciar consultas.
 Classes: Medico (id, nome, especialidade) e Paciente (id, nome, cpf).
 Classe de Associação: Consulta. Ela deve conter a Data (use LocalDateTime), o ValorDaConsulta e as referências para o Médico e o Paciente.
 Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */

package classeassociacao.exe1;

// objeto-parte
public class Medico {
    private String nome, especialidade;
    private int id;

    public Medico() {
    }
    public Medico(int id, String nome, String especialidade ) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                "id=" + id + '\'' +
                '}';
    }
}
