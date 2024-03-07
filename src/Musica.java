public class Musica {
    private String titulo;
    private double duracao;
    private String compositor;


    public Musica(String titulo, double duracao, String compositor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.println("Musica tocando");
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }


    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    public double getDuracao(){
        return this.duracao;
    }


    public void setCompositor(String Compositor){
        this.compositor = compositor;
    }
    public String getCompositor(){
        return this.compositor;
    }

}
