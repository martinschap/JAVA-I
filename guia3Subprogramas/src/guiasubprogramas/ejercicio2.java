package guiasubprogramas;


import java.util.Scanner;

/*
  /**
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
    * e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
 


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta;
        System.out.println("Ingrese 'No' para finalizar el programa");
        do {
            datos();
            System.out.println("¿Desea ingresar mas personas?");
            rta = leer.nextLine();
        } while (!rta.equalsIgnoreCase("No")); 
        System.out.println("HASTA LUEGO");    
    }
    public static void  datos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre;
        int edad;
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = leer.nextInt();
        
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        if (edad >= 18) {
            System.out.println("ES MAYOR DE EDAD");
        }
        else{
            System.out.println("NO ES MAYOR DE EDAD");
        }
        
    }   
}