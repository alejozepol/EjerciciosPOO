/* Punto 3:
    Construir un sistema O.O que represente a un sistema de seguridad en 
    el cual se pueda ingresar nombre de usuario y contraseña, debe existir
    un método para validar si la contraseña ingresada es correcta y un método
    para cambiar la contraseña actual por otra nueva, el sistema deja cambiar
    la contraseña siempre y cuando esta no haya sido usada recientemente, dado
    que el sistema almacena las últimas cuatro usadas. 
 */
package edu.alejozepol.punto3;

import static edu.alejozepol.Punto1.Punto1.punto1;
import edu.alejozepol.ejerciciospoo.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Punto3 {

    public static void logeo() {

        Usuario u1 = new Usuario("alejozepol", "alejo1", "alejo2", "alejo3", "alejo4");

        String cont;
        String usu;

        do {
            usu = JOptionPane.showInputDialog(null, "Por Favor Ingrese su usuario");

            if (usu.equals(u1.nomUsu)) {
                do {
                    cont = JOptionPane.showInputDialog(null, "Por Favor Ingrese su contraseña");
                    usu = u1.nomUsu;

                    if (cont.equals(u1.Contr1)) {
                        new ventana().setVisible(true);
                        cont = u1.Contr1;

                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña Inconrrecto", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } while (cont != u1.Contr1);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario Inconrrecto", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (usu != u1.nomUsu);
 int resp = JOptionPane.showConfirmDialog(null, "¿Desea seguir en el programa?");

        if (JOptionPane.OK_OPTION == resp) {
            logeo();
        } else {
            Menu.Menu();
        }
    }
}
