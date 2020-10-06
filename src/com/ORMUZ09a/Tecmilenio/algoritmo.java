package com.ORMUZ09a.Tecmilenio;

import java.util.ArrayList;

public class algoritmo {

    private int fibo[] = new int[100];
/** metodo para sacar la sucesion de Fibonacci
*   en el cual se areglo con un ciclo for
*  SIGUIENDO LA SUCCESION DE FIBONACCI
*   QUE SUMA LOS ULTIMOS DOS NUMEROS EMPEZADO desde el 0
*   de la siguiente manera
*   0,1,1,2,3,5,8,13....
*   0+1=1
*     1+1=2
*      1+2=3
*    y asi sucesivamente
**/
    public void Fibonacci(int numero) {
        int a = 0, b = 1, c;

        for (int i = 0; i < numero; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
