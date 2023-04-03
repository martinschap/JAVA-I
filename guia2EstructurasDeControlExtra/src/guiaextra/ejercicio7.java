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
public class ejercicio7 {

    /**
     Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
     * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
     * (2 funciones)
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese una cantidad de numeros a ingresar");
        n = leer.nextInt();
        usandoWhile(n);
        //usandoDoWhile(n);
    }
    
    
    public static void usandoWhile (int n){
        Scanner leer = new Scanner(System.in);
       int num, min , max , cont = 1, suma = 0;
    
       System.out.println("Ingrese un numero(mayor a 0)");
            num = leer.nextInt();
            min = num;
            max = num;
            suma = suma + num;
        while (cont < n) {
            System.out.println("Ingrese un numero(mayor a 0)");
            num = leer.nextInt();
            cont++;
            if (num > max) {
                max = num;
            }
            else if (num < min) {
                min = num;
            }
            suma = suma + num; 
        }
        System.out.println("El menor numero ingresado es: "+min);
        System.out.println("El mayor numero ingresado es: "+max);
        System.out.println("El promedio de numeros ingresados es: "+suma/n);
        
    }
    
    
    
    
    
    
   // public static void usandoDoWhile (n){
        
    //}
    
    
    
    
    
}
