package br.com.aceleradev.domain;

import java.time.LocalDate;

public class Professor extends Usuario {
    private LocalDate anoInicioCarreira;
    public Professor(String nome, String login, String cpf, LocalDate anoInicioCarreira) {
        super(nome, login, cpf);
        this.anoInicioCarreira = anoInicioCarreira;
    }

    public LocalDate getAnoInicioCarreira() {
        return anoInicioCarreira;
    }

    public void setAnoInicioCarreira(LocalDate anoInicioCarreira) {
        this.anoInicioCarreira = anoInicioCarreira;
    }
}
