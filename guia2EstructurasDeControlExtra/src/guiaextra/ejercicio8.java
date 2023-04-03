package guiaextra;

import java.util.Scanner;

/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break. */
public class ejercicio8 {
    /**
     * @param args
     */
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        int num, par = 0, impar = 0, cant = 0;
        boolean mult = false;
        do {
            System.out.println("Ingrese un numero entero mayor a 0"); 
            num = leer.nextInt();
            
            if (num < 0) {
                System.out.println("Ingresó un numero negativo..");
            }
            else if(num % 2 == 0) {
                par++;
                cant++;    
            }  
            else {
                impar++;
                cant++;
            }
            if (num > 0 && num % 5 == 0) {
                mult = true;
            }
        

        }while (mult != true); 
        System.out.println("INGRESÓ UN NUMERO MULTIPLO DE 5!");
        System.out.println("CANTIDAD DE NUMEROS: " +cant);
        System.out.println("CANTIDAD DE NUMEROS PARES: " +par);
        System.out.println("CANTIDAD DE NUMEROS IMPARES: " +impar);
        System.out.println("Hasta luego :D");
        leer.close();
    }
}
