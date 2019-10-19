package br.com.aceleradev.domain;

import java.time.LocalDate;

public class Aluno extends Usuario{

    private Integer numeroMatricula;

    public Aluno(String nome, String login, String cpf, LocalDate dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

}
