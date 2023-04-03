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
public class ejercicio5 {

    /**
     Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de los números 
     * introducidos supere el límite inicial.
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un valor positivo");
        valor = leer.nextInt();
        while (valor<0){
                System.out.println("Ingrese un valor positivo");
        valor = leer.nextInt();
        } 
        int suma;
        suma=0;
        int num;
        while (suma<valor){
          System.out.println("Ingrese un número"); 
          num = leer.nextInt();
          suma=suma+num;
        }
        System.out.println("La suma de los números ingresados es "+ suma);
    }
    
    
}
