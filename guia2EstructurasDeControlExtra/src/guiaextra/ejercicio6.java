/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaextra;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ejercicio6 {

    /**
     Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

     */
    public static void main(String[] args) {
        float altura, prom = 0, prom2 = 0, cont = 0 , cantP , cantP2 = 0, acumA = 0, acumA2 = 0; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas para determinar el promedio de estaturas");
        cantP = leer.nextFloat();
        if (cantP < 1) {
            System.out.println("No ha ingresado una cantidad valida");
        }
        else { 
                System.out.println("Ingrese la altura de la/s persona");
               while (cont < cantP) {               
                altura = leer.nextFloat();   
                if (altura < 1.60) {
                    cantP2++;
                    acumA2 = acumA2 + altura;    
                    prom2 = acumA2 / cantP2;
                }
                acumA = acumA + altura;
                cont++;
               }
               if (cantP2 < 1) {
                   System.out.println("No se ingresaron estaturas que se encuentren por debajo de 1.60");
               }
               else {
                 System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 es de: "+prom2 +" cm");
               }
                 prom = acumA / cantP ;
                 System.out.println("El promedio de estaturas en general es de "+prom + " cm");  
        }    
    }
        
}
    
