package br.com.aceleradev.main;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Disciplina;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;
import br.com.aceleradev.repositories.UsuarioRepository;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        Aluno aluno = new Aluno(
                "Gustavo ",
                "gustavo123",
                "123.456.789-23");
        aluno.adicionaDisciplina("HUMANAS");
        Aluno aluno2 = new Aluno(
                "Gustavo 2",
                "gustavo13",
                "123.456.789-23");
        aluno2.adicionaDisciplina("EXATAS");
        aluno2.adicionaDisciplina("BIOLOGICAS");

        Professor professor = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23");
        professor.adicionaDisciplina("EXATAS");
        professor.adicionaDisciplina("BIOLOGICAS");

        usuarioRepository.insere(aluno);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(professor);

        System.out.println("Professores:");
        usuarioRepository.mostraProfessores();

        System.out.println("Alunos:");
        usuarioRepository.mostraAlunos();

        System.out.println("Alunos do prof: " + usuarioRepository.contaAlunosPorProfessor(professor.getNome()));

//        Disciplina disciplina = new Disciplina("Matematica", professor);
//        disciplina.matricular(aluno);

//        System.out.println(disciplina);
//        disciplina.mostraAlunos();


    }

}
