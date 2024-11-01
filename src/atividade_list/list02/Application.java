package atividade_list.list02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %sº valor: ", i + 1);
            numeros.add(read.nextInt());
        }

        System.out.println("Digite o número que você deseja encontrar:");
        int encontrarNumero = read.nextInt();

        if (numeros.contains(encontrarNumero)) {
            System.out.printf("O número %s está localizado na posição: %s", encontrarNumero, numeros.indexOf(encontrarNumero));
        } else {
            System.out.printf("O número %s não foi encontrado!", encontrarNumero);
        }
    }
}
