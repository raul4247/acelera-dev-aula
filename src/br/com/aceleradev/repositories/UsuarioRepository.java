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
}

