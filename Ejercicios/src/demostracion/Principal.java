/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

//importación del paquete Scanner

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String[] args) {
        
        //declaracion de variables 
        double tarifa = 3;
        int mensaje;
        double iva;
        double extra;
        double operacion;
        Scanner teclado = new Scanner (System.in);
        
        //mensaje al usuario
        System.out.println("Generador de tarifas telefónicas\nPor favor ingrese"
                + " el número de mensajes mandados:\n");
        mensaje = teclado.nextInt();
        
        //condicional if 
        if (mensaje >= 200){
            // para calcular cuantos mensajes son mayores a 200
            extra = mensaje - 200; //obtener el numero de mensajes >200 
            operacion = extra * 0.10;//calcular el valor de los mesajes > 200
            tarifa = tarifa + operacion;
            
            // para obtener el valor de los mensajes entre 200 y 41
            mensaje = 159;
            operacion = mensaje * 0.05; // calcular el valor de mensajes <200
            tarifa = tarifa + operacion;
        }else{
            if (mensaje > 40 && mensaje <= 200){
                
                //para obtener el precio de los mensajes mayores a 40 
                extra = mensaje -40;
                operacion = mensaje * 0.05; //calcular el valor de mensajes <200
                tarifa = tarifa + operacion; 
            }
        }
        iva = tarifa * 0.12;
        tarifa = tarifa + iva;
        System.out.printf("El valor de su tarifa a pagar es de: %.2f", tarifa );
     
    }
}
