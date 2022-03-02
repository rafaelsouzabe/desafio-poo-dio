package Dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
        super();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int calcularXP() {
       return super.getXP_PADRAO() * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + this.getCargaHoraria() + '\'' +
                ", XP=" + super.getXP_PADRAO() + '\'' +
                '}';
    }
}
