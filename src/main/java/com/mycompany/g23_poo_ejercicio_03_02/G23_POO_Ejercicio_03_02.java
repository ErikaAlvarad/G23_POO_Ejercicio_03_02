/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.g23_poo_ejercicio_03_02;

/**
 *
 * @author erika
 */
public class G23_POO_Ejercicio_03_02 {

    public static void main(String[] args) {
        var v1 = new Ventana1("Inscripcion Universidad");
        v1.setVisible(true);
         var v2 = new Ventana2("Datos");
        v2.setVisible(true);
        
        var v3 = new Ventana3("Datos Carrera");
        v3.setVisible(true);
        
        var v4 = new Ventana4("Datos Carrera");
        v4.setVisible(true);
        
        var v5 = new Ventana5("Datos Carrera");
        v5.setVisible(true);
    }
}
