import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Faça um programa que receba de lista de compras sendo que o
        //usuário irá inserir a quantidade de itens que quer adicionar na lista
        //de compras e após inserir a quantidade o programa deverá permitir
        //que o usuário insira os produtos nessa lista

        int listaCompras[] = new int[5];

        Scanner sc = new Scanner(System.in);

        int listaQtdade;
        String produtosLista;

        System.out.println("----LISTA DE COMPRAS----");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a quantidade de itens: ");
            listaQtdade = sc.nextInt();

            System.out.println("A quantidade de itens é: " + listaQtdade);

            System.out.println("Digite quais serão os produtos: ");
            produtosLista = sc.next();

            System.out.println("Lista completa: " + "Quantidade de itens: " + listaQtdade + " e " + "Produto que irá levar: " +
                    produtosLista);
        }

    }
}
