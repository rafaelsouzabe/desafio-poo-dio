package Test;

import Dominio.Curso;
import Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("JAVA");
        curso.setCargaHoraria(200);
        curso.setDescricao("Orientacao a Objetos");
        curso.calcularXP();
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Primeira Mentoria");
        mentoria.setDescricao("Duvidas sobre JAva OO");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
