package AulasJavaFiap;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final  int N = 30;

        // teste
        int n = 0;
        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];


        System.out.print("Digite seu RM: ");
        int rmLido = sc.nextInt();
        while (rmLido >= 0 && n < N){
           rm[n] = rmLido;
            System.out.print("Digite a nota 1: ");
            nota1[n] = sc.nextDouble();
            System.out.print("Digite a nota 2: ");
            nota2[n] = sc.nextDouble();

            n++;
            System.out.print("Digite seu RM: ");
            rmLido = sc.nextInt();
        }
        double[] media = new double[N];
        for (int i = 0; i < n; i++){
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.printf("RM: %d | Média %.1f ", rm[i], media[i]);
        }
        int[] rmAprovados = new int[n];
        int nAp = 0;
        for (int i = 0; i < n; i++){
            if (media[i]>=6){
                rmAprovados[nAp] = rm[i];
                nAp++;
            }
        }
        System.out.println("\n ***** Alunos Aprovados *******");
        for (int i = 0; i < nAp; i++){
            System.out.println(rmAprovados[i]);
        }
    }
}