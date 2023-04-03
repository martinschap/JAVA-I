/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ejercicio4 {
    /**
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
    * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,en caso contrario,
    * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        String frase;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una frase/palabra");
         frase = leer.nextLine();

     
         if ("a".equals(frase.substring(0,1))) {
             System.out.println("CORRECTO");
        }
         else{
             System.out.println("INCORRECTO");
         }
    }    
}
