/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaextra;

/**
 *
 * @author ACER
 */

import java.util.Scanner;

// Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
// se muestre su equivalente en romano.

public class ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Ingrese un numero para tranformarlo en romano");
            numero = entrada.nextInt();
            
        } while ( numero < 1 || numero > 10 );

            switch (numero) {

                case 1:
    
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: I");
                    break;
            
                case 2:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: II");
                    break;
    
                case 3:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: III");
                    break;
    
                case 4:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: IV");
                    break;
            
                case 5:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: V");
                    break;
    
                case 6:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: VI");
                    break;
    
                case 7:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: VII");
                    break;
    
                case 8:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: VIII");
                    break;
    
                case 9:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: IX");
                    break;
    
                case 10:
                
                    System.out.println("El numero romano equivalente a " + numero + " es igual a: X");
                    break;
    
            }

    }

}