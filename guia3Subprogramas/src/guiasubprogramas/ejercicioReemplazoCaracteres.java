package guiasubprogramas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class ejercicioReemplazoCaracteres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase a convertir: ");
        String frase = sc.nextLine();

        System.out.println(Conversor(frase));

    }//// cierra el main


    /////////////////////////////////////////////////////////
    public static String Conversor(String frase){
    
    String auxiliar = "";

    for (int i=0; i<frase.length() ; i++){
        switch(frase.substring(i,i+1).toLowerCase()){
            case "a":
            auxiliar += "@";
            break;

            case "e":
            auxiliar += "#";
            break;

            case "i":
            auxiliar += "$";
            break;

            case "o":
            auxiliar += "%";
            break;

            case "u":
            auxiliar += "*";
            break;

            default:
            auxiliar += frase.substring(i,i+1);

        }

    }/// cierra el For
       
    return auxiliar;
    // System.out.println("FRASE TRANSFORMADA: " + auxiliar);

    } /// cierra el Sub-programa

/////////////////////////////////////////////////////////

} /// cierra la clase principal