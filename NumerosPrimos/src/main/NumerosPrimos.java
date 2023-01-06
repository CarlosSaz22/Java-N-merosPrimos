package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class NumerosPrimos {

    public static void main(String[] args) {

        int max = 23;

        for (int x = 2; x <= max; x++) {
            if (verificarNumeroPrimo(x)) {
                System.out.println(x + " es primo");
            }
        }

    }

    public static boolean verificarNumeroPrimo(int numero) {
        int contador = 2;
        boolean numeroPrimo = true;
        while ((numeroPrimo) && (contador != numero)) {
            if (numero % contador == 0) {
                numeroPrimo = false;
            }
            contador++;
        }
        return numeroPrimo;
    }
}