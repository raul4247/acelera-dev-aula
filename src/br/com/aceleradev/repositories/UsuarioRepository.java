package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;

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
