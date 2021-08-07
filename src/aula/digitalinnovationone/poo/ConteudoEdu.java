package aula.digitalinnovationone.poo;

public abstract class ConteudoEdu {

    protected static final double expPadrao = 10.0;

    public abstract double calcularXp();

    private String titulo, descricao;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
