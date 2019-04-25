/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

//importacion del paquete Scanner y la clase con los mensajes 

import java.util.Scanner;
import paquetedos.Operacion;


/**
 *
 * @Edgar Guamo Usuario ITC
 */ 
public class SeleccionDoble {
   
    public static void main(String[] args) {
        
        //Declaracion de variables
        
        int calificacion;
        Scanner teclado = new Scanner(System.in);
        
        String mensaje = Operacion.mensaje;
        String mensaje2 = Operacion.mensaje2;
                
        
        //Petición de datos por teclado
        
        System.out.println("Por favor ingrese su nota");
        calificacion = teclado.nextInt();
        
        //condicional if
        if (calificacion >= 85){
            System.out.printf("%s %d\n", mensaje, calificacion);
        }else{ // Palabra resevada para sino
            System.out.printf("%s %d\n", mensaje2, calificacion);
        }
        
        int calificacion_2 =45;
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", mensaje, calificacion_2);
        }else{ // Palabra resevada para sino
            System.out.printf("%s %d\n", mensaje2, calificacion_2);
        }
        
    }
}
