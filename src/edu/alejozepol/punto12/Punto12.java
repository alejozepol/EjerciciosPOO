/**
 * *
 * Esta clase es la principal del paquete la cual se utiliza para acceder al
 * desarrollo del punto 2 del taller del Programacion Orientado a Objetos del
 * programada de ADSI- SENA 1068180
 *
 */
package edu.alejozepol.punto12;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Punto12 {

    public static void punto12() {
        Colegios c1 = new Colegios(860066942, "Pequeños Gigantes", "Cl 12 12 12", 7606060);
        c1.addEstudiantes(1,"Acudiente1","Estudiante1", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(2,"Acudiente1","Estudiante2", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(3,"Acudiente1","Estudiante3", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(4,"Acudiente2","Estudiante1", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(5,"Acudiente2","Estudiante2", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(6,"Acudiente3","Estudiante1", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(7,"Acudiente3","Estudiante2", 3, 1, 900000, 150000, 50000);
        c1.addEstudiantes(8,"Acudiente4","Estudiante1", 3, 1, 900000, 150000, 50000);
        
        c1.addAcudientes(1, "Acudiente","1",(c1.getEstudiantes().subList(0, 0)));
        
        
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(0, 1));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(0, 2));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(1, 3));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(1, 4));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(2, 5));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(2, 6));
        c1.addAcudientes(1, "Acudiente","1",c1.getEstudiantes().subList(2, 6));
        c1.addAcudientes(2, "Acudiente 2");
        c1.addAcudientes(3, "Acudiente 3");
        c1.addAcudientes(4, "Acudiente 4");
        
        if(c1.getEstudiantes().)
        
        
            nueva.add(i);
        }

        for (Integer i : l2.regresarVector()) {
            nueva.add(i);
        }

        nueva = nueva.ordenar(nueva);

        return nueva;
    }
        AcudienteEstudiante.
        

        JOptionPane.showMessageDialog(null,
                "El colegio “pequeños gigantes” desea calcular el monto a pagar por inscripción\n"
                + "del nuevo año escolar, para las familias con hijos en el colegio. Para ello \n"
                + "se conoce el número de hijos que tiene la familia en el colegio, el monto de\n"
                + "matrícula por niño, el monto de la mensualidad del mes de septiembre por niño\n"
                + "y el monto de la sociedad de padres. Elabore un algoritmo que calcule el total\n"
                + "a pagar por la familia, si la sociedad de padres se cobra una vez por familiar\n"
                + "y si se otorga un descuento por la cantidad de hijos en el colegio que viene \n"
                + "dado por la siguiente tabla.\n"
                + "Cantidad de hijos	Descuento  \n"
                + "2 niños  	 	10%  \n"
                + "3 niños  	 	25%  \n"
                + "> 3 niños 	 	30%  \n");

        Object opciones = JOptionPane.showInputDialog(null, "Seleccione la acción que quieres realizar:",
                "Opciones", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Consultar Informacion del Colegio", "Consultar Acudiente:",
                    "Consultar Estudiantes", "Consultar Valores a pagar por Acudiente",
                    "Consultar total pension", "Consultar total Matricula", "Consultar total sociedad padres"}, "Seleccione");
        
        if (opciones.equals("Consultar Informacion del Colegio")) {
        
            JOptionPane.showMessageDialog(null, c1.toString());
        
        } else if (opciones.equals("Consultar Acudiente:")) {
            JOptionPane.showMessageDialog(null, c1.getAcudientes().toString());
        
        } else if (opciones.equals("Consultar Estudiantes")) {
            JOptionPane.showMessageDialog(null, c1.getEstudiantes().toString());
        
        } else if (opciones.equals("Consultar estudiantes por acudiente")) {

        } else if (opciones.equals("Consultar Valores a pagar por Acudiente")) {
            JOptionPane.showMessageDialog(null, c1.getEstudiantes().toString());
        } else if (opciones.equals("Consultar Valores a pagar por Acudiente")) {
            String cs = JOptionPane.showInputDialog("Ingrese identificacion Acudiente:");
            int num = Integer.parseInt(cs);

        }
    }
}
