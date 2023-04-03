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
// Dado un tiempo en minutos, calcular su equivalente en días y horas. 
// Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int minutos , contadorDias = 0 , contadorHoras = 0;

        System.out.println(" Ingrese la cantidad de minutos a transformar : ");
        minutos = entrada.nextInt();

        while ( minutos >= 1440 ) {
            
            contadorDias++;

            minutos = minutos - 1440;

        }

        while ( minutos < 1440 && minutos >= 60 ){

            contadorHoras++;

            minutos = minutos - 60;

        }

        System.out.println("La cantidad de DIAS es igual a: " + contadorDias);
        System.out.println("La cantidad de HORAS es igual a: " + contadorHoras);

        entrada.close();

    }

}