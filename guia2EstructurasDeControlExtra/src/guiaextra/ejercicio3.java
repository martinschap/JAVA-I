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
// Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
// Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String letra;

        System.out.println("Ingrese una letra");
        letra = entrada.nextLine();

        if ( "a".equalsIgnoreCase(letra) ) {
            
            System.out.println("El caracter ingresado es igual a la vocal 'a' ");

        } else if ( "e".equalsIgnoreCase(letra) ) {

            System.out.println("El caracter ingresado es igual a la vocal 'e' ");

        } else if ( "i".equalsIgnoreCase(letra) ) {

            System.out.println("El caracter ingresado es igual a la vocal 'i' ");

        }else if ( "o".equalsIgnoreCase(letra) ) {

            System.out.println("El caracter ingresado es igual a la vocal 'o' ");

        }else if ( "u".equalsIgnoreCase(letra) ) {

            System.out.println("El caracter ingresado es igual a la vocal 'u' ");

        } else {

            System.out.println("El caracter ingresado no es igual a una vocal ");

        }

    }

}
