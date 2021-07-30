package ifsp.lp3a5.lista7;

public class Musica {

    private String titulo;

    private String duracao;

    private String cantor;

    private String cd;

    public Musica() {

    }

    public Musica(String titulo, String duracao, String cantor, String cd) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.cantor = cantor;
        this.cd = cd;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getCantor() {
        return cantor;
    }

    public String getCd() {
        return cd;
    }

}
