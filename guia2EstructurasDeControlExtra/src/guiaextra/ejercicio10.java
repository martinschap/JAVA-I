package guiaextra;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
    El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario
    ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java */
public class ejercicio10 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10); /*entre 1 y 9 */
        int num2 = (int) (Math.random() * 10); /*entre 1 y 9 */
        int resu = num1 * num2;
        int intento;
        /*
        System.out.println(""+num1); 
        System.out.println(""+num2);
        System.out.println(""+resu);
        SI ACTIVA ESTO, PUEDE VERIFICAR LOS DATOS INGRESADOS*/
        boolean enc = false;
        System.out.println("NUM 1 = ?");
        System.out.println("NUM 2 = ?");
        System.out.println("Intente encontrar el resultado de la multiplicacion");
        intento = leer.nextInt();
        if (intento == resu){
            System.out.println("LO ENCONTRÓ!!!");
        }
        else{
            System.out.println("Intente nuevamente");
            intento = leer.nextInt();
            if (intento == resu){
                System.out.println("LO ENCONTRÓ!!!");
            }
            else{
                System.out.println("No lo encontró :(");
            }  
        }
        leer.close();
    }    
}
