package aula.digitalinnovationone.poo;

import java.time.LocalDateTime;

public class Mentoria extends ConteudoEdu {

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return expPadrao;
    }

    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
