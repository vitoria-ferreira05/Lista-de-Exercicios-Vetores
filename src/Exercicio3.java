import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Faça um programa que receba 10 números inteiros, armazene-os e
        //verifique quais numeros são pares, e exiba para o usuário apenas os
        //números pares da lista

        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroVetor[] = new int[10];

        System.out.println("NÚMEROS PARES");
        System.out.println("------------------------------------");

       for (int i = 0; i < 10; i++){
           System.out.println("Digite o número: ");
           numero = sc.nextInt();
       }
        System.out.println("------------------------------------");
        for (int i = 1; i < numeroVetor.length; i++){
            if (i % 2 == 0){
                System.out.println("O número pares são: " + i);
            }
        }
    }
}
