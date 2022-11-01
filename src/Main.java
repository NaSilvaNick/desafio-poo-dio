import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    Curso curso2 = new Curso();
    Mentoria mentoria1 = new Mentoria();
    Mentoria mentoria2 = new Mentoria();

    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("Descrição curso Java");
    curso1.setCargaHoraria(8);

    curso2.setTitulo("Curso de JavaScript");
    curso2.setDescricao("Descrição curso JavaScript");
    curso2.setCargaHoraria(4);

    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição da mentoria de Java");
    mentoria1.setData(LocalDate.now());

    mentoria2.setTitulo("Mentoria de JavaScript");
    mentoria2.setDescricao("Descrição da mentoria de JavaScript");
    mentoria2.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();

    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao(" Descrição bootcamp java developer");

    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo Inscritos DevCamila: " + devCamila.getConteudosInscritos());
    devCamila.progredir();
    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conteudo Inscritos DevCamila: " + devCamila.getConteudosInscritos());
    System.out.println("Conteudo Concluido DevCamila: " + devCamila.getConteudosConcluidos());
    System.out.println("XP da DevCamila: " + devCamila.calcularTotalXp());

    System.out.println("\n-------------\n");

    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteudo Inscritos DevJoao: " + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteudo Inscritos DevJoao: " + devJoao.getConteudosInscritos());
    System.out.println("Conteudo Concluido DevJoao: " + devJoao.getConteudosConcluidos());
    System.out.println("XP do DevJoão: " + devJoao.calcularTotalXp());
  }
}
