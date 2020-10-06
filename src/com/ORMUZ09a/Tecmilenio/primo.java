package com.ORMUZ09a.Tecmilenio;

import java.util.ArrayList;


public class primo {
    public static void main(String[] args) {
        algoritmo al = new algoritmo();
        al.Fibonacci(10);

        System.out.println(encontrar_primos(1, 100));
    }
// realizo el metodo para los numeros primos de la siguente manera
    public static ArrayList<Integer> encontrar_primos(int start, int end) {

        ArrayList<Integer> num_primos = new ArrayList<Integer>();
        for (int n = start; n < end; n++) {
            boolean primos = true;

            int p = 2;
            while (p <= n / 2) {
                if (n % 1 == 0) {
                    primos = false;
                    break;
                }
                p++;
            }
            if (primos) {
                num_primos.add(n);
            }
        }
        return num_primos;
    }
}

