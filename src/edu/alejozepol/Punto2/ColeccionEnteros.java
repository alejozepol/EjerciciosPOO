/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.Punto2;

import edu.alejozepol.ejerciciospoo.Menu;
import static java.lang.Math.max;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class ColeccionEnteros {

    private int numero, max, min;
    private int[] conjuntoEnteros;
    private Random rnd = new Random();
    private String entrada;

    public ColeccionEnteros(int numero, int[] conjuntoEnteros) {
        this.numero = numero;
        this.conjuntoEnteros = conjuntoEnteros;
    }

    public ColeccionEnteros() {

    }

    public void entrada() {
        entrada = JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros que llenaran el arreglo:");

        if (entrada != null && !entrada.contentEquals("")) {
            numero = (Integer.parseInt(entrada));
            conjuntoEnteros = new int[numero];

            for (int i = 0; i < conjuntoEnteros.length; i++) {
                conjuntoEnteros[i] = rnd.nextInt(101);

            }
        } else {
            Menu.Menu();
        }

    }

    public void desplegarColeccion() {
        for (int i = 0; i < conjuntoEnteros.length; i++) {
            System.out.println(conjuntoEnteros[i]);
        }

    }

    public void existeValor() {

        for (int i = 0; i < conjuntoEnteros.length; i++) {
            if (conjuntoEnteros[i] == numero) {
                JOptionPane.showMessageDialog(null, "El numero " + conjuntoEnteros[i] + " hace parte de los numeros aleatorios");
            }
        }

    }

    public void maximoValor() {
        numero = numero - 1;
        max = min = conjuntoEnteros[numero];

        for (int i = 0; i < conjuntoEnteros.length; i++) {
            if (conjuntoEnteros[i] > max) {
                max = conjuntoEnteros[i];
                JOptionPane.showMessageDialog(null, "El numero " + conjuntoEnteros[i] + " es el numero maximo almacenado");
            }
        }

    }

    public void desplegarPosicionesMultiplo(int num) {
        entrada = JOptionPane.showInputDialog(null, "Ingrese el numeros para verificar los indices que son multiples de él:");
        if (entrada != null && !entrada.contentEquals("")) {
            num = (Integer.parseInt(entrada));
            for (int i = 0; i < conjuntoEnteros.length; i++) {
                int resto = i % num;

                if (resto == 0) {
                    JOptionPane.showMessageDialog(null, " El numero " + conjuntoEnteros[i] + " almacenado en el indice " + i + " es multiple de "
                            + num);
                }
            }
        }

    }

    public void promedioValores(int total, int promedio) {
        for (int i = 0; i < conjuntoEnteros.length; i++) {
            total = total + conjuntoEnteros[i];
        }
        promedio = total / conjuntoEnteros.length;
        JOptionPane.showMessageDialog(null, " El promedio de los numeros generados son: total numeros: " + total + " dividido entre " + conjuntoEnteros.length
                + " para un total de: " + promedio);

    }

    public void invertir() {

        Object[] invertir_int = new Object[conjuntoEnteros.length];
        int maximo = conjuntoEnteros.length;

        for (int i = 0; i < conjuntoEnteros.length; i++) {
            invertir_int[maximo - 1] = conjuntoEnteros[i];
            maximo--;
        }

        for (int i = 0; i < invertir_int.length; i++) {
            Object j = invertir_int[i];
            System.out.println("Arreglo invertido: " + j);

        }

    }

    public void duplicarCeldasMultiplo(int num, int resto) {
        entrada = JOptionPane.showInputDialog(null, "Ingrese un numero:");
        if (entrada != null && !entrada.contentEquals("")) {
            num = (Integer.parseInt(entrada));
            for (int i = 0; i < 10; i++) {
                resto=num%conjuntoEnteros[i];
                if (resto==0) {

                    JOptionPane.showMessageDialog(null, " El numero " + conjuntoEnteros[i] + " almacenado en el indice " + i + " es multiple de "
                            + num);
                }
            }
        }
    }

}


