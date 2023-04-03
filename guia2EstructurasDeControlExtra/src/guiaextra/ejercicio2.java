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
// Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
// A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
// A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
// Utilizar sólo una variable auxiliar.

public class ejercicio2 {
    
    public static void main(String[] args) {
        
        int A = 2,B = 3 ,C = 4, D = 5,varAux;
        
        System.out.println("Los valores iniciales son:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        varAux = B;
        B = C;
        C = A;
        A = D;
        D = varAux;

        System.out.println("Los valores finales son:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
    }

}