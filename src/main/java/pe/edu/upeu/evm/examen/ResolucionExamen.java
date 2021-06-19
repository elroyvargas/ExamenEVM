/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.evm.examen;

import pe.edu.upeu.evm.utils.LeerTeclado;

/**
 *
 * @author USUARIO
 */
public class ResolucionExamen {

    static LeerTeclado teclado = new LeerTeclado();

    public static void pregunta2() {

        Double precio;
        System.out.println("ingrese 1 para categoria 1");
        System.out.println("ingrese 2 para categoria 2");
        System.out.println("ingrese 3 para categoria 3");
        int tipo = teclado.leer(0, "ingrese categoria");
        precio = teclado.leer(0.0, "ingrese precio");

        switch (tipo) {
            case 1: {
                System.out.println("el precio es por categoria uno");
                System.out.println("el precio a pagar es" + precio * 1.12);

            }
            break;
            case 2: {
                System.out.println("el precio es por categoria dos");
                System.out.println("el precio a pagar es" + precio * 1.08);
            }
            break;
            case 3: {
                System.out.println("el precio es por categoria tres");
                System.out.println("el precio a pagar es" + precio * 1.05);
            }
            break;
            default: {
                System.out.println("la categoria no esta definida");

            }
            break;
        }
    }

    public static void pregunta3() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 20; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    public static void pregunta4() {
        int cantidad = teclado.leer(0, "ingrese el rango en el que desee llegar");
        int i, j, suma;

        i = 1;
        System.out.println("la busqueda esta entre " + i + " y " + cantidad);

        while (i <= cantidad) {      // i es el número que vamos a comprobar
            suma = 0;
            for (j = 1; j < i; j++) {    // j son los divisores. Se divide desde 1 hasta i-1                          
                if (i % j == 0) {
                    suma = suma + j; // si es divisor se suma
                }
            }
            if (i == suma) {             // si el numero es igual a la suma de sus divisores es perfecto              
                System.out.println(i);
            }
            i++;
            pregunta4();
        }
    }

    public static void pregunta5() {
        int base = teclado.leer(0, "ingrese base");
        int exponente = teclado.leer(0, "ingrese exponente");
        System.out.println("el resultado es " + power(base, exponente));

    }

    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }

}
