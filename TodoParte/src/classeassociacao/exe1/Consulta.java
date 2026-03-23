package classeassociacao.exe1;

/*Crie um sistema para gerenciar consultas.
 Classes: Medico (id, nome, especialidade) e Paciente (id, nome, cpf).
 Classe de Associação: Consulta. Ela deve conter a Data (use LocalDateTime), o ValorDaConsulta e as referências para o Médico e o Paciente.
 Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Consulta{" +
                ", data=" + data.format(formatoBR)+
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", valor da consulta=" + valorDaConsulta +
                '}';
    }
}
