package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    public void insere(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostraProfessores() {
        usuarios.forEach(usuario -> {
            if (usuario instanceof Professor) {
                System.out.println(usuario);
//                Professor professor = (Professor) usuario;
            }

        });
    }

    public void mostraAlunos() {
        usuarios.forEach(usuario -> {
            if (usuario instanceof Aluno) {
                System.out.println(usuario);
            }
        });
    }
    public double mediaIdadeAlunos(){
        double soma = 0.0;
        int numAlunos = 0;
        for(Usuario u: usuarios ){
            if(u instanceof Aluno){
                numAlunos++;
                soma+=(LocalDate.now().getYear() - u.getDataNascimento().getYear());
            }
        };
        return soma/(double)numAlunos;
    }

    public double mediaExpProfessores() {
        double soma = 0.0;
        int numProfs = 0;
        for (Usuario u : usuarios) {
            if (u instanceof Professor) {
                numProfs++;
                soma += (LocalDate.now().getYear() - ((Professor) u).getAnoInicioCarreira().getYear());
            }
        }
        ;
        return soma / (double) numProfs;
    }
    public void contaProfessoresDisciplina(){
        int bio = 0, exa = 0, hum = 0;
        for(Usuario u: usuarios){
            if(u instanceof Professor){
                if(((Professor) u).getDisciplina().equals("BIOLOGICAS"))
                    bio++;
                else if(((Professor) u).getDisciplina().equals("EXATAS"))
                    exa++;
                else if(((Professor) u).getDisciplina().equals("HUMANAS"))
                    hum++;
            }
        }
        System.out.println("Professores de bio: " + bio);
        System.out.println("Professores de exatas: " + exa);
        System.out.println("Professores de humanas: " + hum);
    }
    public int contaAlunosPorProfessor(String nome) {
        int pos = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Professor) {
                if (((Professor) usuarios.get(i)).getNome().equals(nome)) {
                    pos = i;
                    break;
                }
            }
        }
        int alunos = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Aluno) {
                for (String disc : usuarios.get(i).getDisciplinas()) {
                    if (usuarios.get(pos).getDisciplinas().contains(disc)) {
                        alunos++;
                        break;
                    }
                }
            }
        }
        return  alunos;
    }
}
