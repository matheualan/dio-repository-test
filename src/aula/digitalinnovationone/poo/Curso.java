package aula.digitalinnovationone.poo;

public class Curso extends ConteudoEdu {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return expPadrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
