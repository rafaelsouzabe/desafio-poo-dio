package Test;

import Dominio.Curso;
import Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("JAVA","Curso java DIO" ,90);
        curso.setCargaHoraria(200);
        curso.setDescricao("Orientacao a Objetos");
        System.out.println(curso);

        Mentoria mentoria = new Mentoria("Mentoria 1 JAVA", "Como comecar a programar", LocalDate.now());
        System.out.println(mentoria);
    }
}
