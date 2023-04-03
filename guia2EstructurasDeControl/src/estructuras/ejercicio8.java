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
public class ejercicio8 {

    /**
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     */
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado ");
        n = leer.nextInt();
        for ( int i = 0 ; i < n ; i++ ){

            System.out.print("*");
            
            }

            System.out.println("");

        

    }
    
}
