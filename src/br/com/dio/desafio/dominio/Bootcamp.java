package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public void adicionarDev(Dev dev) {
    this.devsInscritos.add(dev);
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void adicionarConteudo(Conteudo conteudo) {
    this.conteudos.add(conteudo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Bootcamp)) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicial(), bootcamp.getDataInicial()) && Objects.equals(getDataFinal(), bootcamp.getDataFinal()) && Objects.equals(getDevsInscritos(), bootcamp.getDevsInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNome(), getDescricao(), getDataInicial(), getDataFinal(), getConteudos());
  }
}
