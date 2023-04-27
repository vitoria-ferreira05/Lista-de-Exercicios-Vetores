import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5. Faça um programa que permita que o usuário digite o nome de uma
        //banda musical e insira o nome de 3 músicas dessa banda, as músicas
        //deverão ser armazenadas e no final o programa deverá mostrar a
        //seguinte mensagem:

        //NomeDaBanda
        //Musica1
        //Musica2
        //Musica3

        String musicas[] = new String[3];
        String bandaMusical, musicasDaBanda;

        Scanner sc = new Scanner(System.in);

        System.out.println("---BANDAS MUSICAIS---");

        for (int i = 0; i < 3; i++){
            bandaMusical = sc.next();

        }
        for (int i = 0; i < musicas.length; i++){

            musicasDaBanda = sc.next();
        }

    }
}
