package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Dev {
  private String nome;
  private boolean pro = false;
  private Set<Bootcamp> bootcampsInscritos = new LinkedHashSet<>();
  private Set<Bootcamp> bootcampsConcluidos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    if (this.bootcampsInscritos.contains(bootcamp)) {
      System.out.println(nome + " já se inscreveu no Bootcamp: " + bootcamp.getNome());
      return;
    }

    if (this.bootcampsInscritos.size() > 0 && !this.pro) {
      System.out.println("Você não pode se inscrever em outro Bootcamp, já está inscrito em um Bootcamp.");
      System.out.println("Torne-se Pro para ter acesso a todos os Bootcamps");
      return;
    }

    this.bootcampsInscritos.add(bootcamp);
    this.conteudosInscritos.addAll(bootcamp.getConteudos());

    bootcamp.adicionarDev(this);

    System.out.println(nome + " se inscreveu no Bootcamp: " + bootcamp.getNome());
  }

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

    if (conteudo.isPresent()) {
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
      System.out.println(nome + " progredindo...");
    } else {
      System.out.println(nome + ", você não está matriculado(a) em nenhum conteúdo!");
    }

    for (Bootcamp bootcamp : this.bootcampsInscritos) {
      if (conteudosConcluidos.containsAll(bootcamp.getConteudos())) {
        bootcampsConcluidos.add(bootcamp);
        bootcampsInscritos.remove(bootcamp);
        System.out.println(this.nome + " finalizou o bootcamp: " + bootcamp.getNome());
      }
    }
  }

  public double calcularTotalXp() {
    return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
  }

  public boolean isPro() {
    return this.pro;
  }

  public void tornarPro() {
    this.pro = true;
    System.out.println("Parabéns " + nome + "!!! Agora você é Pro.");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<String> getBootcampsInscritos() {
    return bootcampsInscritos.stream().map(Bootcamp::getNome).collect(Collectors.toSet());
  }

  public Set<String> getBootcampsConcluidos() {
    return bootcampsConcluidos.stream().map(Bootcamp::getNome).collect(Collectors.toSet());
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Dev)) return false;
    Dev dev = (Dev) o;
    return getNome().equals(dev.getNome()) && getConteudosInscritos().equals(dev.getConteudosInscritos()) && getConteudosConcluidos().equals(dev.getConteudosConcluidos());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
  }
}
