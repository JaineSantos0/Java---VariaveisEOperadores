package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número1: ");
        float numero1 = sc.nextFloat();

        System.out.print("Número2: ");
        float numero2 = sc.nextFloat();

        System.out.print("Número3: ");
        float numero3 = sc.nextFloat();

        System.out.print("Número4: ");
        float numero4 = sc.nextFloat();

        float calculo = (numero1 * numero2) - (numero3 * numero4);

        System.out.print("Diferença: " + calculo);
    }
}