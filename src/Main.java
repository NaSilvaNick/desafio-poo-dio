import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    Curso curso2 = new Curso();
    Mentoria mentoria1 = new Mentoria();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso Java");
    curso1.setCargaHoraria(8);

    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Descrição curso JavaScript");
    curso2.setCargaHoraria(4);

    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição da mentoria de Java");
    mentoria1.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);

    Conteudo curso3 = new Curso();
    Conteudo mentoria2 = new Mentoria();
  }
}
