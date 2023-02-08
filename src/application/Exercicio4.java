package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número1: ");
        int numero1 = sc.nextInt();

        System.out.print("Número2: ");
        int numero2 = sc.nextInt();

        System.out.print("Número3: ");
        int numero3 = sc.nextInt();

        System.out.print("Número4: ");
        int numero4 = sc.nextInt();

        int calculo = (numero1 * numero2) - (numero3 * numero4);

        System.out.print("Diferença: " + calculo);
    }
}