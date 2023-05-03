import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao de mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        *System.out.println(curso2);
        *System.out.println(mentoria);
        **/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricão do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWanderson = new Dev();
        devWanderson.setNome("Wanderson");
        devWanderson.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Wanderson" + devWanderson.getConteudosInscritos());
        devWanderson.progredir();
        devWanderson.progredir();
        devWanderson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Wanderson" + devWanderson.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Wanderson" + devWanderson.getConteudosConcluidos());
        System.out.println("XP: " + devWanderson.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }
}