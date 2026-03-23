package classeassociacao.exe1;

/*Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */
import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {

        // Criando médico
        Medico medico = new Medico(1, "Dr. João", "Cardiologia");

        // Criando paciente
        Paciente paciente = new Paciente(1, "Maria", "123.456.789-00");

        // Criando consulta (20/05/2026)
        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);

        Consulta con = new Consulta(
                dataConsulta,
                200.00,
                medico,
                paciente
        );

        System.out.println(con.getMedico().getNome());
        System.out.println(con.getPaciente().getNome());
    }
}
