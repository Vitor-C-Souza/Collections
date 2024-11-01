package atividades_set.list04;

import java.util.HashSet;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %sº valor: ", i + 1);
            numeros.add(read.nextInt());
        }

        System.out.println("Digite o número que você deseja encontrar:");
        int encontrarNumero = read.nextInt();

        if (numeros.contains(encontrarNumero)) {
            System.out.printf("O número %s foi encontrado!", encontrarNumero);
        } else {
            System.out.printf("O número %s não foi encontrado!", encontrarNumero);
        }
    }
}
