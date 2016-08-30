/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.punto12;

import java.util.List;

/**
 *
 * @author alejozepol
 */
public class Acudientes extends Terceros{

    private List<Estudiantes> estudiantes;

    public Acudientes(long identificacionAcudiente, String apellidoAcudiente, String nombreAcudiente,List<Estudiantes> estudiantes) {
        super(identificacionAcudiente, apellidoAcudiente, nombreAcudiente);
        this.estudiantes = estudiantes;
    }
    
}
