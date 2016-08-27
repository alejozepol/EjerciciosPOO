/*
 * Esta clase es la principal del paquete la cual se utiliza para acceder al
* desarrollo del punto 2 del taller del Programacion Orientado a Objetos del 
* programada de ADSI- SENA 1068180
 */
package edu.alejozepol.Punto2;

import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Punto2 {

    public static void punto2() {

        JOptionPane.showMessageDialog(null, "Punto 2: Se desea programar una clase que permita\n"
                + "representar una colección acotada de valores enteros. Para almacenar los valores\n"
                + " de la colección, la clase utilizará como único atributo un arreglo de acuerdo\n"
                + "con la siguiente declaración:\n"
                + " \n"
                + "public class ColeccionEnteros {  private int [] arreglo;...} \n"
                + "\nEl método constructor de la clase deberá recibir como parámetro el tamaño que\n"
                + "deberá tener el arreglo. Dentro del método, se deberá crear el arreglo con esa\n"
                + "cantidad de celdas y posteriormente se deberán cargar las mismas con valores generados\n"
                + "al azar. Además del método constructor, la clase deberá proveer los siguientes métodos:  \n"
                + "• DesplegarColeccion ( ). Este método deberá desplegar en pantalla\n"
                + "todos los valores almacenados en el arreglo.  \n"
                + "• ExisteValor (int valor). Este método deberá determinar si el\n "
                + "valor recibido como parámetro forma parte del arreglo o no.  \n"
                + "• MaximoValor ( ). Este método deberá devolver el máximo valor\n"
                + "almacenado en el arreglo.  \n"
                + "• DesplegarPosicionesMultiplo (int num). Este método deberá desplegar\n"
                + "en pantalla todos los valores del arreglo almacenados en celdas cuyo\n"
                + "índice sea múltiplo de num.  \n"
                + "• PromedioValores ( ). Este método deberá calcular el promedio\n"
                + "de todos los valores almacenados en el arreglo.  \n"
                + "• Invertir ( ). Este método deberá invertir los valores almacenados\n"
                + "en el arreglo. Es decir, el valor de la primera celda deberá intercambiarse\n"
                + "con el valor de la última celda. El valor de la segunda celda deberá\n"
                + "intercambiarse con el valor de la penúltima celda, y así sucesivamente.  \n"
                + "• DuplicarCeldasMultiplo (int valor). Este método deberá duplicar el \n"
                + "valor de cada celda del arreglo que contenga un elemento que sea múltiplo\n"
                + "del valor recibido como parámetro.  \n"
                + "• HayRepetidos ( ). Este método deberá determinar si el arreglo posee al\n"
                + " menos un valor repetido en más de una celda o no. ");

        ColeccionEnteros coleccion = new ColeccionEnteros();

        coleccion.entrada();
        JOptionPane.showMessageDialog(null, "Acontinuacion se imprimira por Consolda el listado de nuemeros generados:");
        coleccion.desplegarColeccion();
        coleccion.existeValor();
        coleccion.maximoValor();
        coleccion.desplegarPosicionesMultiplo(0);
        coleccion.promedioValores(0, 0);
        coleccion.invertir();
    }

}
