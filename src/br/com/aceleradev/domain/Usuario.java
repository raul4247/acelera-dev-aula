package br.com.aceleradev.domain;

import br.com.aceleradev.exceptions.LoginInvalidoException;

import java.util.ArrayList;
import java.util.List;

import static br.com.aceleradev.utils.MensagemException.LOGIN_MENOR_DE_TRES_CARACTERES;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;
    private List<String> disciplinas;

    public Usuario(String nome, String login, String cpf) {
        this.nome = nome;
        setLogin(login);
        this.cpf = cpf;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(loginInvalido(login)){
            throw new LoginInvalidoException(LOGIN_MENOR_DE_TRES_CARACTERES);
        }

        this.login = login;

    }

    private boolean loginInvalido(String login) {
        return login.length() <= 3;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome
                + "\nlogin: " + this.login
                + "\ncpf: " + this.cpf + "\n";
    }
    public void adicionaDisciplina(String disciplina){
        this.disciplinas.add(disciplina);
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
