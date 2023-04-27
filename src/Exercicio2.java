public class Exercicio2 {
    public static void main(String[] args) {
        //2. Faça um programa de lista de chamada que armazene o nome de
        //10 alunos e apresente a lista completa para o usuário

        String[] alunos = new String[10];

        System.out.println("LISTA DE CHAMADA: ");

        alunos[0] = "João Gabriel";
        alunos[1] = "Ana Menezes";
        alunos[2] = "Vitória Ferreira";
        alunos[3] = "José Silva";
        alunos[4] = "Maria Eduarda";
        alunos[5] = "Maria Clara Santos";
        alunos[6] = "Joaquim Silva";
        alunos[7] = "Ana Luiza Borges";
        alunos[8] = "Caroline Silva";
        alunos[9] = "Vanessa Souza";

        for (int i = 0; i < alunos.length; i++){
            System.out.println(i + " Nome" + " : " + alunos[i]);
        }

    }
}
