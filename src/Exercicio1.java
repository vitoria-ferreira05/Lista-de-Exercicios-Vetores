import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Faça um programa que leia 5 valores inteiros, armazene-os em um
        //vetor, calcule e apresente a soma destes valores

        Scanner sc = new Scanner(System.in);
        int soma = 0, valoresDig;
        int[] valores = new int[5];

        System.out.println("ENTRE COM OS VALORES PARA A SOMA ");
        //valoresDig = sc.nextInt();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite os valores: ");
            valores[i] = sc.nextInt();

        }
        System.out.println("----------------------------");

        System.out.println("Soma dos números: ");

        for (int i = 0; i < valores.length; i++) {
            //soma = i + valores[i];
            soma += valores[i]; //soma = soma + valores[i];
            System.out.println("A soma dos números é: " + i + "+" + valores[i] + "=" + soma);
        }
    }
}
