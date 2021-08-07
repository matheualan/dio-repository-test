import aula.digitalinnovationone.poo.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Execute {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Basico");
        cursoJava.setDescricao("Conceitos básicos sobre Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoAngular = new Curso();
        cursoAngular.setTitulo("Angular");
        cursoAngular.setDescricao("Conceitos básiscos para Front-End com Angular.");
        cursoAngular.setCargaHoraria(8);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Java SpringBoot");
        cursoSpring.setDescricao("Conceitos básiscos Spring Boot.");
        cursoSpring.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Orientação a objetos com Java");
        mentoria.setDescricao("Conceitos básicos da programação orientação a objetos, seus pilares, e tudo que você " +
                "precisa saber para dominar os conceitos da programação orientada a objetos.");
        mentoria.setData(LocalDateTime.now()); // .plusDays(1) para escolher uma data futura

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Desenvolvedor Java / FullStack");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        //List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJava, cursoSpring, cursoAngular);
        //bootcamp.setConteudos(conteudosBootcamp);
        bootcamp.setConteudos(Arrays.asList(cursoJava, cursoSpring, cursoAngular));

        Devs matheusao = new Devs();
        matheusao.setNome("Matheusão");
        matheusao.inscrever(cursoJava);
        matheusao.inscrever(bootcamp);
        matheusao.progredir();
        matheusao.progredir();
        matheusao.progredir();

        System.out.println();

        Devs eloyza = new Devs();
        eloyza.setNome("Eloyza");
        eloyza.inscrever(bootcamp);
        eloyza.progredir();
        eloyza.progredir();

        System.out.println(String.format("XP Total Matheusao: %.2f", matheusao.calcularXpTotal()));
        System.out.println(String.format("XP Total Eloyza: %.2f", eloyza.calcularXpTotal()));
    }
}
