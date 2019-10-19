package br.com.aceleradev.main;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Disciplina;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;
import br.com.aceleradev.repositories.UsuarioRepository;

import java.time.LocalDate;
import java.time.Month;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        Aluno aluno = new Aluno(
                "Gustavo ",
                "gustavo123",
                "123.456.789-23", LocalDate.of(2018,  Month.JANUARY, 1));

        aluno.adicionaDisciplina("HUMANAS");
        Aluno aluno2 = new Aluno(
                "Gustavo 2",
                "gustavo13",
                "123.456.789-23", LocalDate.of(2017,  Month.JANUARY, 1));
        aluno2.adicionaDisciplina("EXATAS");
        aluno2.adicionaDisciplina("BIOLOGICAS");

        Professor professor = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23", LocalDate.of(2018, Month.JANUARY, 1),
                LocalDate.of(2018, Month.JANUARY, 1), "BIOLOGICAS");

        Professor professor2 = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23", LocalDate.of(2018, Month.JANUARY, 1),
                LocalDate.of(2018, Month.JANUARY, 1), "BIOLOGICAS");

        Professor professor3 = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23", LocalDate.of(2018, Month.JANUARY, 1),
                LocalDate.of(2018, Month.JANUARY, 1), "BIOLOGICAS");

        professor.adicionaDisciplina("EXATAS");
        professor.adicionaDisciplina("BIOLOGICAS");

        usuarioRepository.insere(aluno);
        usuarioRepository.insere(aluno2);
        usuarioRepository.insere(professor);
        usuarioRepository.insere(professor2);
        usuarioRepository.insere(professor3);

        System.out.println("Professores:");
        usuarioRepository.mostraProfessores();

        System.out.println("Alunos:");
        usuarioRepository.mostraAlunos();

        System.out.println("Alunos do prof: " + usuarioRepository.contaAlunosPorProfessor(professor.getNome()));
        System.out.println("Media idades : " + usuarioRepository.mediaIdadeAlunos());
        System.out.println("Media exp : " + usuarioRepository.mediaExpProfessores());

        usuarioRepository.contaProfessoresDisciplina();
//        Disciplina disciplina = new Disciplina("Matematica", professor);
//        disciplina.matricular(aluno);

//        System.out.println(disciplina);
//        disciplina.mostraAlunos();


    }

}
