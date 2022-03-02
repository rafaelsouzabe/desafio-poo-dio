package Dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
        super();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria +
                '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void calcularXP(double XP_PADRAO) {

    }
}
