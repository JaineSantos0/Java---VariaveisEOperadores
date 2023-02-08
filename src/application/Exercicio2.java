package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = sc.nextFloat();
        System.out.print("Nota 4: ");
        float nota4 = sc.nextFloat();

        float mediaFinal = (nota1 + nota2 +  nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f",mediaFinal);
    }
}