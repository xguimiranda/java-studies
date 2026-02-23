package AulasJavaFiap;

import java.util.Scanner;

public class Exercicio2 {
    static Scanner sc = new Scanner(System.in);
    static final  int N = 30;
    public static void main(String[] args) {


        int[] rm = new int[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];

        entradaDados(rm, nota1, nota2);
    }
    public static void entradaDados(int[] rm, double[] nota1,double[] nota2){
        System.out.print("Digite seu RM: ");
        int n = 0;
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
    }
}
