import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("Descrição curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de JavaScript");
    curso2.setDescricao("Descrição curso JavaScript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição da mentoria de Java");
    mentoria1.setCargaHoraria(8);
    mentoria1.setData(LocalDate.now());

    Mentoria mentoria2 = new Mentoria();
    mentoria2.setTitulo("Mentoria de JavaScript");
    mentoria2.setDescricao("Descrição da mentoria de JavaScript");
    mentoria2.setCargaHoraria(10);
    mentoria2.setData(LocalDate.now());

    Bootcamp bootcamp1 = new Bootcamp();
    bootcamp1.setNome("Bootcamp Java & JavaScript Developer");
    bootcamp1.setDescricao(" Descrição bootcamp Java & JavaScript Developer");
    bootcamp1.adicionarConteudo(curso1);
    bootcamp1.adicionarConteudo(curso2);
    bootcamp1.adicionarConteudo(mentoria1);
    bootcamp1.adicionarConteudo(mentoria2);

    // ---------------------------------------------- //

    Curso curso3 = new Curso();
    curso3.setTitulo("Curso de Python");
    curso3.setDescricao("Descrição curso Python");
    curso3.setCargaHoraria(8);

    Curso curso4 = new Curso();
    curso4.setTitulo("Curso de SQL");
    curso4.setDescricao("Descrição curso SQL");
    curso4.setCargaHoraria(4);

    Mentoria mentoria3 = new Mentoria();
    mentoria3.setTitulo("Mentoria de Python");
    mentoria3.setDescricao("Descrição da mentoria de Python");
    mentoria3.setCargaHoraria(8);
    mentoria3.setData(LocalDate.now());

    Mentoria mentoria4 = new Mentoria();
    mentoria4.setTitulo("Mentoria de SQL");
    mentoria4.setDescricao("Descrição da mentoria de SQL");
    mentoria4.setCargaHoraria(10);
    mentoria4.setData(LocalDate.now());

    Bootcamp bootcamp2 = new Bootcamp();
    bootcamp2.setNome("Bootcamp Python & SQL Developer");
    bootcamp2.setDescricao(" Descrição bootcamp Python & SQL Developer");
    bootcamp2.adicionarConteudo(curso3);
    bootcamp2.adicionarConteudo(curso4);
    bootcamp2.adicionarConteudo(mentoria3);
    bootcamp2.adicionarConteudo(mentoria4);

    // ---------------------------------------------- //

    System.out.println(" ");

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.tornarPro();

    System.out.println(" ");

    devCamila.inscreverBootcamp(bootcamp1);

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevCamila:\n"+ "\t" + devCamila.getBootcampsInscritos());
    System.out.println("Conteudo Inscritos DevCamila:\n"+ "\t" + devCamila.getConteudosInscritos());

    System.out.println(" ");

    devCamila.progredir();

    System.out.println(" ");

    devCamila.inscreverBootcamp(bootcamp1);

    System.out.println(" ");

    devCamila.inscreverBootcamp(bootcamp2);

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevCamila:\n"+ "\t" + devCamila.getBootcampsInscritos());
    System.out.println("Conteudo Inscritos DevCamila:\n"+ "\t" + devCamila.getConteudosInscritos());

    System.out.println(" ");

    devCamila.progredir();

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevCamila:\n"+ "\t" + devCamila.getBootcampsInscritos());
    System.out.println("Bootcamps Concluidos DevCamila:\n"+ "\t" + devCamila.getBootcampsConcluidos());
    System.out.println("Conteudos Concluidos DevCamila:\n"+ "\t" + devCamila.getConteudosConcluidos());

    System.out.println(" ");

    System.out.println("XP da DevCamila: " + devCamila.calcularTotalXp());

    System.out.println("\n-----------------------------------------\n");


    Dev devJoao = new Dev();
    devJoao.setNome("João");

    System.out.println(" ");

    devJoao.inscreverBootcamp(bootcamp1);

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevJoao:\n"+ "\t" + devJoao.getBootcampsInscritos());
    System.out.println("Conteudo Inscritos DevJoao:\n"+ "\t" + devJoao.getConteudosInscritos());

    System.out.println(" ");

    devJoao.progredir();
    devJoao.progredir();

    System.out.println(" ");

    devJoao.inscreverBootcamp(bootcamp1);

    System.out.println(" ");

    devJoao.inscreverBootcamp(bootcamp2);

    System.out.println(" ");

    devJoao.progredir();
    devJoao.progredir();

    System.out.println(" ");

    devJoao.progredir();

    System.out.println(" ");

    devJoao.inscreverBootcamp(bootcamp2);

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevJoao:\n"+ "\t" + devJoao.getBootcampsInscritos());
    System.out.println("Conteudo Inscritos DevJoao:\n"+ "\t" + devJoao.getConteudosInscritos());

    System.out.println(" ");

    System.out.println("Bootcamps Inscritos DevJoao:\n"+ "\t" + devJoao.getBootcampsInscritos());
    System.out.println("Bootcamps Concluidos DevJoao:\n"+ "\t" + devJoao.getBootcampsConcluidos());
    System.out.println("Conteudo Concluido DevJoao:\n"+ "\t" + devJoao.getConteudosConcluidos());

    System.out.println(" ");

    System.out.println("XP do DevJoão: " + devJoao.calcularTotalXp());

  }
}
