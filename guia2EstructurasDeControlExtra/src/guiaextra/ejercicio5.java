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
public class ejercicio5 {

    /*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
    y determine el importe en efectivo a pagar por dicho socio.

     */
    public static void main(String[] args) {
        String letra;
        double costo, desc = 0;
        Scanner leer = new Scanner(System.in);
        do {
             System.out.println("Ingrese la clase de socio a la que pertenece");
             System.out.println("A , B o C ");
             letra = leer.nextLine();
        /* upperCase */
        } while ((!"A".equals(letra)) && (!"B".equals(letra)) && (!"C".equals(letra)));
        
        System.out.println("Ingrese el costo del tratamiento");
        costo = leer.nextDouble();
        if ("A".equals(letra)) {
            desc = costo * 0.5;
            System.out.println("El importe en efectivo a pagar es de $ "+desc);
        }
        else if ("B".equals(letra)) {
            desc = costo * 0.35;
            System.out.println("El importe en efectivo a pagar es de $ "+desc);
        }
        else {
            System.out.println("El importe en efectivo a pagar es de $ "+costo);
        }
    }
    
}
