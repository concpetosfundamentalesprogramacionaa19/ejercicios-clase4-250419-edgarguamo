/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;
/**
 *
 * @Edgar Guamo Usuario ITC
 */
public class SeleccionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declarion de variables
        String mensaje = Operacion.mensaje;
        int calificacion;
        Scanner teclado = new Scanner(System.in);
        
        //mensaje de Bienvenida
        System.out.println("Bienvenido al Sistema de Revision de Notas \n"
                + "Por favor ingrese su nota:");
        calificacion = teclado.nextInt();
        
        //Condicional if simple
        if (calificacion >= 85){
            System.out.printf( "%s %d\n", mensaje, calificacion);
        }
        
        int calificacion_2 = 45;
        if (calificacion_2 >= 85){
            System.out.printf( "%s %d\n", mensaje, calificacion);
        }
    }
    
}
