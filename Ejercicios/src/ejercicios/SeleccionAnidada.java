/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;



import java.util.Scanner;
import paquetedos.Operacion2;

/**
 *
 * @author Usuario iTC
 */
public class SeleccionAnidada {
    public static void main(String[] args) {
        
        //declaracion de variables 
        int calificacion;
        Scanner teclado = new Scanner (System.in);
        
        //variables importadas de Operaciones2
        String nota90 = Operacion2.nota90;
        String nota80 = Operacion2.nota80;
        String nota50 = Operacion2.nota50;
        String reprobado = Operacion2.reprobado;
        
        //Mensaje al cliente
        System.out.println("Por favor ingrese su nota:");
        
        //Asignacion de los datos por teclado a una variable 
        calificacion = teclado.nextInt();
        
        //Condicional if anidada
        if (calificacion >= 90){ 
            System.out.printf("%s %d\n", nota90, calificacion);
        }else{
            if(calificacion < 90 && calificacion >=80){
                System.out.printf("%s %d\n", nota80, calificacion);
            }else{
                if (calificacion <80 && calificacion >= 50 ){
                    System.out.printf("%s %d\n", nota50, calificacion);
                    
                }else{
                    System.out.printf("%s %d\n", reprobado, calificacion);
                    
                }
            }
        }                
    }
}
