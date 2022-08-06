import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPietra = new Dev();
        devPietra.setNome("Pietra");
        devPietra.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pietra" + devPietra.getConteudosInscritos());
        devPietra.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pietra" + devPietra.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pietra" + devPietra.getConteudosConcluidos());
        System.out.println("XP: " + devPietra.calcularTotalXp());

        System.out.println("----------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael" + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devPietra.calcularTotalXp());



    }
}
