/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.Punto1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Punto1 {

    public static void punto1() {

        int num;
//        
//        Habitacion ha1=new Habitacion(101, 2, 101, false, true);
//        Habitacion ha2=new Habitacion(102, 1, 102, true, true);
//        Habitacion ha3=new Habitacion(103, 3, 103, true, true);
        Hotel h1 = new Hotel("cr 20 20 20", "Bogotá", "Chapinero", 555555);

        h1.addHabitacion(101, 1, 101, true, true, 0);
        h1.addHabitacion(102, 2, 102, false, true, 1);
        h1.addHabitacion(103, 3, 103, true, false, 2);

        
           
        Scanner teclado = new Scanner(System.in);
        num=teclado.nextInt();
        
        h1.setIndice(num);
        
        System.out.println(h1.getHabitacion());
        
        h1.mostrar();
        
        Huesped cliente1= new Huesped("jhon fredy ", "cra 34 # 20-23", "puto", "casado");
        
       h1.getHabitacion().setClientes(cliente1);
       
        System.out.println( h1.getHabitacion().getClientes().toString());

    }

}
