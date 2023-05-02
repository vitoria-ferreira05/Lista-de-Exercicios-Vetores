import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Faça um programa que receba 10 números inteiros, armazene-os e
        //verifique quais numeros são pares, e exiba para o usuário apenas os
        //números pares da lista

        Scanner sc = new Scanner(System.in);
        int numeroVetor[] = new int[10];

        System.out.println("NÚMEROS PARES");
        System.out.println("------------------------------------");

        for (int i = 0; i < numeroVetor.length; i++) {
            System.out.println("Digite o número: ");
            numeroVetor[i] = sc.nextInt();
        }
        System.out.println("------------------------------------");

        for (int i = 0; i < numeroVetor.length; i++) {
            if (numeroVetor[i] % 2 == 0) {
                System.out.println("O número pares são: " + numeroVetor[i]);
            }
        }
    }
}
