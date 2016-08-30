/*
Punto: En una clase accesoria que contenga un método “main” llene un ArrayList 
con Números (Enteros, Naturales, etc. ) desde el teclado, usando una clase que 
realice las siguientes operaciones:  
a.	Permita llenar el número de elementos que el usuario desee  
b.	Imprima los elementos cargados en la colección usando un ciclo for.  
c.	Imprima los elementos cargados en la colección usando un iterador.  
d.	Cargue el Número contenido en la posición 14 de la colección.  
e.	Imprima el elemento 14 de la lista.  
f.	Itere la lista imprimiendo sólo los números complejos.  
 */
package edu.alejozepol.punto5;

import edu.alejozepol.ejerciciospoo.Menu;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Lista {

    public static void punto5() {

        JOptionPane.showMessageDialog(null, "Punto: En una clase accesoria que\n"
                + "contenga un método “main” llene un ArrayList con Números\n"
                + "(Enteros, Naturales, etc. ) desde el teclado, usando\n "
                + "una clase que realice las siguientes operaciones: \n"
                + "a.Permita llenar el número de elementos que el usuario desee\n"
                + "b.Imprima los elementos cargados en la colección usando un ciclo for.\n"
                + "c.Imprima los elementos cargados en la colección usando un iterador.\n"
                + "d.Cargue el Número contenido en la posición 14 de la colección.\n"
                + "e.Imprima el elemento 14 de la lista.\n"
                + "f.Itere la lista imprimiendo sólo los números sc);\n");

        int numero;
        String teclado;

        teclado = JOptionPane.showInputDialog("Ingrese la cantidad"
                + " de numeros que quieren que Ingresar");
        if (teclado != null && !teclado.contentEquals("")) {

            numero = (Integer.parseInt(teclado));
            ArrayList<Integer> lista = new ArrayList();

            for (int i = 1; i <= numero; i++) {
                lista.add(Integer.parseInt(JOptionPane.showInputDialog("El Números " + i)));
            }

            for (int j = 0; j < numero; j++) {
                System.out.println(lista.get(j));
            }
            Iterator<Integer> iteLista = lista.iterator();
            while (iteLista.hasNext()) {
                int elemento = iteLista.next();

                JOptionPane.showMessageDialog(null, (elemento));
            }
            if ( 14<=numero ) {
                 JOptionPane.showMessageDialog(null,lista.get(13));
            }else{
                JOptionPane.showMessageDialog(null,"Posicion numero 14 no utilizado");
            }
              
        } else {
            Menu.Menu();
        }

    }

}
