package aula.digitalinnovationone.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Devs {

    private String nome;
    private List<ConteudoEdu> conteudosInscritos = new ArrayList<>();
    private List<ConteudoEdu> conteudosConcluidos = new ArrayList<>();

//    Polimorfismo de sobrecarga
    public void inscrever(ConteudoEdu conteudoEdu) {
        if(conteudosInscritos.contains(conteudoEdu)) {
            System.err.println("Você já se inscreveu neste conteúdo.");
        } else {
            conteudosInscritos.add(conteudoEdu);
            System.out.println("Inscrição realizada com sucesso!");
        }
    }
//    Polimorfismo de sobrecarga
    public void inscrever(Bootcamp bootcamp) {
//        1 - foreach tradicional
        for (ConteudoEdu conteudo : bootcamp.getConteudos()) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
//        2 - API de Stream
//        bootcamp.getConteudos().stream().forEach(this::inscrever);
    }

    public void progredir() {
        Optional<ConteudoEdu> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
        } else {
            System.err.println("Nenhum conteúdo inscrito.");
        }
    }

    public double calcularXpTotal() {
        return conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
