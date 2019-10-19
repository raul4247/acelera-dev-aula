package br.com.aceleradev.domain;

import java.time.LocalDate;

public class Professor extends Usuario {

    public Professor(String nome, String login, String cpf, LocalDate dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

}
