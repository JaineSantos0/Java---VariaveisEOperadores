package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        System.out.print("Abono: ");
        float abono = sc.nextFloat();

        float novoSalario = salario + abono;

        System.out.printf("Novo salário = %.2f",novoSalario);
    }
}