// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        String idade = scanner.nextLine();
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Duracao: ");
        String duracao = scanner.nextLine();
        System.out.println("Compositor: ");
        String compositor = scanner.nextLine();
        System.out.println("Genero: ");
        String genero = scanner.nextLine();
        System.out.println("Ano: ");
        String ano = scanner.nextLine();
        System.out.println("Nome da musica: ");
        String nome_musica = scanner.nextLine();
        System.out.println("Artista: ");
        String artista = scanner.nextLine();
        System.out.println("Musicas: ");
        String musicas = scanner.nextLine();


        System.out.println(nome);
        System.out.println(idade);
        System.out.println(titulo);
        System.out.println(duracao);
        System.out.println(compositor);
        System.out.println(genero);
        System.out.println(ano);
        System.out.println(nome_musica);
        System.out.println(artista);
        System.out.println(musicas);

        }
    }