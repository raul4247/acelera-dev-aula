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
            if(usuario instanceof Professor){
                System.out.println(usuario);
//                Professor professor = (Professor) usuario;
            }

        });
    }

    public void mostraAlunos() {
        usuarios.forEach(usuario -> {
            if(usuario instanceof Aluno){
                System.out.println(usuario);
            }
        });
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
}
