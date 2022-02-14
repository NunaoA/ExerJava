package Ex6;

import java.util.Scanner;

public class ProgAutomovel {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos automoveis?");
        System.out.println("Quantas motas?");

        int N = sc.nextInt();
        sc.nextLine();

        Automovel [] automoveis = new Automovel[N];

        for(int i = 1; i <= N; i++)
        {
            System.out.println("Marca do " + i +"º automovel: ");
            String marcaA = sc.nextLine();
            System.out.println("Modelo do " + i +"º automovel: ");
            String modeloA = sc.nextLine();
            sc.nextLine();
            System.out.println("Custo do " + i +"º automovel: ");
            double custoA = sc.nextDouble();
            sc.nextLine();
            Automovel a = new Automovel(marcaA, modeloA, custoA);
            automoveis[i-1]=a;

        }
    }
}
