import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<Musica>();
    }

    public void mostraTodosOsDados(){

    }

    public String getGenero(){
        return this.genero;
    }

    public double getAno(){
        return this.ano;
    }

    public String getNome(){
        return this.nome;
    }

    public String getArtista() {
        return this.artista;
    }


}
