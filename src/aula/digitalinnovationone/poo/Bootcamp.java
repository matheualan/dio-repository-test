package aula.digitalinnovationone.poo;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private List<Devs> devs = new ArrayList<>();
    private LocalDate inicio, fim;
    private List<ConteudoEdu> conteudos = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Devs> getDevs() {
        return devs;
    }
    public void setDevs(List<Devs> devs) {
        this.devs = devs;
    }

    public LocalDate getInicio() {
        return inicio;
    }
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }
    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public List<ConteudoEdu> getConteudos() {
        return conteudos;
    }
    public void setConteudos(List<ConteudoEdu> conteudoEdus) {
        this.conteudos = conteudoEdus;
    }
}
