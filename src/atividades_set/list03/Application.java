package atividades_set.list03;

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

        System.out.println("Listar dados do Set:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
