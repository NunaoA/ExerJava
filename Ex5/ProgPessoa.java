package Ex5;

import java.util.Scanner;

public class ProgPessoa {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas?");
        int J = sc.nextInt();
        sc.nextLine();

        Pessoa [] pessoas = new Pessoa[J];

        double peso = 0;
        double altura = 0;

        for(int i = 1; i <= J; i++)
        {
            System.out.println("Nome da " + i +"º pessoa: ");
            String nome = sc.nextLine();
            System.out.println("Altura da " + i +"º pessoa: ");
            altura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Peso da " + i +"º pessoa: ");
            peso = sc.nextDouble();
            sc.nextLine();
            Pessoa p = new Pessoa(nome, altura, peso);
            pessoas[i-1]=p;

        }
        double totalPeso = 0;
        double totalAltura = 0;
        double mediaP = totalPeso/J;
        double mediaA = totalAltura/J;

        for(int i = 0; i<=J; i++) {
            System.out.println("Pessoas " + (i + 1) + ": " + pessoas[i].getNome());
            totalPeso += pessoas[i].getPeso();
            totalAltura += pessoas[i].getAltura();
        }

        System.out.printf("Media do peso: ", mediaP);
        sc.nextDouble();
        System.out.printf("Media da altura: ", mediaA);
        sc.nextDouble();


    }
}
