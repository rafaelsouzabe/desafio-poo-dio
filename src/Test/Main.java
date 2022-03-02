package Test;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Orientacao a Objetos");
        curso1.setCargaHoraria(200);
//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Laravel");
        curso2.setDescricao("PHP + Laravel");
        curso2.setCargaHoraria(80);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Primeira Mentoria");
        mentoria.setDescricao("Duvidas sobre JAva OO");
        mentoria.setData(LocalDate.now());
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAva GFT");
        bootcamp.setDescricao("Descricao provisoria pro bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael Souza");
        devRafael.inscreverBootcamp(bootcamp);
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();

        System.out.println(devRafael);

        System.out.println("\n____________________________________________________________\n");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();

//        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
//        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println(devJoao);



    }
}
