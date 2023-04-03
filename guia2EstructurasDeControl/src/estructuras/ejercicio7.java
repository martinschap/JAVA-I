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
public class ejercicio7 {
    /**
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
    tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE,
    que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
    Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        String cadena; 
        int longg;
        int contC;
        int contI;
        contC = 0;
        contI = 0;
        System.out.println("DISPOSITIVO RS232");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabras con un maximo de 5 caracteres de largo, cuando NO decida ingresar más, inserte '&&&&&' y finalizará el programa");
        do {
        cadena = leer.nextLine();
        cadena = cadena.toUpperCase(); 
        longg = cadena.length();
        if (cadena.substring(0,1) == "X" && cadena.substring(longg - 1 ,longg) == "O" && (longg <= 5)) { 
            contC++;
        }
        else {
            contI++;
        }
        } while (!"&&&&&".equals(cadena) );
        System.out.println("La cantidad de cadenas correctas ingresadas es de:" +contC);
        System.out.println("La cantidad de cadenas incorrectas ingresadas es de:" +(contI - 1));
         
        
        
        
        
        
        
        
        
    }
}
