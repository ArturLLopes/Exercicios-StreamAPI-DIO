package com.exercicios.desafio2;

import java.util.Arrays;
import java.util.List;

public class Soma {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n-> n % 2 == 0)      // filtra só os números pares
                .mapToInt(Integer::intValue) // converte para IntStream para poder usar sum()
                .sum();

        System.out.println("Soma dos numero pares é : " + somaPares);
    }
}
