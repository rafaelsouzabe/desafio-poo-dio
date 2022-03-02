package Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
        super();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + this.data + '\'' +
                ", XP=" + super.XP_PADRAO + '\'' +
                '}';
    }

    @Override
    public int calcularXP() {
        return super.getXP_PADRAO() + 20;
    }
}
