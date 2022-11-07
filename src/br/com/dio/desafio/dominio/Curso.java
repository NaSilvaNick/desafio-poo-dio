package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

  public Curso() {
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * getCargaHoraria();
  }
}
