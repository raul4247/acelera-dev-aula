package br.com.aceleradev.domain;

import java.time.LocalDate;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String nome, String login, String cpf, LocalDate dataNascimento,String disciplina) {
        super(nome, login, cpf, dataNascimento);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
