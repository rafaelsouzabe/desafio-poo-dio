package Dominio;

public abstract class Conteudo implements IConteudo{
    protected final int XP_PADRAO = 10;
    private String titulo;
    private String descricao;



    public int getXP_PADRAO() {
        return XP_PADRAO;
    }


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
