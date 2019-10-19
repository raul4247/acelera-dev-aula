package br.com.aceleradev.domain;

public class Professor extends Usuario {
    private String disciplina;

    public Professor(String nome, String login, String cpf, String disciplina) {
        super(nome, login, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
