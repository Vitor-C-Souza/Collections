package atividade_list.list01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<String> cores = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite %sº cor: ", i + 1);
            cores.add(read.nextLine());
        }

        System.out.println("Listar todas as cores:");

        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);
        System.out.println("Ordenar as cores");

        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
