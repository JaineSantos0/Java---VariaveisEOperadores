package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário bruto: ");
        float salarioBruto = sc.nextFloat();

        System.out.print("Adicional noturno: ");
        float adicionalNoturno = sc.nextFloat();

        System.out.print("Horas extras: ");
        float horasExtras = sc.nextFloat();

        System.out.print("Descontos: ");
        float descontos = sc.nextFloat();

        float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;

        System.out.printf("Salário líquido: %.2f", salarioLiquido);
    }
}