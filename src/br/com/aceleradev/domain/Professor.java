package br.com.aceleradev.domain;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

public class Professor extends Usuario {
    private LocalDate anoInicioCarreira;
    private String disciplina;

    public Professor(String nome, String login, String cpf,  LocalDate dataNascimento, LocalDate anoInicioCarreira, String disciplina) {
        super(nome, login, cpf, dataNascimento);
        this.anoInicioCarreira = anoInicioCarreira;
        this.disciplina = disciplina;

    }

    public LocalDate getAnoInicioCarreira() {
        return anoInicioCarreira;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setAnoInicioCarreira(LocalDate anoInicioCarreira) {
        this.anoInicioCarreira = anoInicioCarreira;
    }
}
