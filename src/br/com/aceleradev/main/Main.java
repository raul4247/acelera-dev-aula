package br.com.aceleradev.main;

import br.com.aceleradev.domain.Aluno;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

//        try {
//            aluno = new Aluno(
//                    "Gustavo",
//                    "gus",
//                    "123.456.789-12");
//        } catch (Exception e ) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }


        Aluno aluno = new Aluno(
                "Gustavo",
                "gus",
                "123.456.789-12",LocalDate.of(2017,  Month.JANUARY, 1));;

//        System.out.println(aluno);

    }

}
