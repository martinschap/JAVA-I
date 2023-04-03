    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        Menu(num1,num2);

      System.out.println("Cerrando el Programa");

    }/// Cierra el main

    
    public static void Menu(int num1, int num2){

        Scanner sc = new Scanner(System.in);


        int respuesta = 1;

        do{
            System.out.println("MENU PRINCIPAL >>");
            System.out.println("1- SUMAR NUMEROS");
            System.out.println("2- RESTAR NUMEROS");
            System.out.println("3- MULTIPLICAR NUMEROS");
            System.out.println("4- DIVIDIR NUMEROS");
            System.out.println("0- SALIR");

            respuesta = sc.nextInt();

            switch(respuesta){
                case 1:
                System.out.println("RESULTADO: " + Suma(num1,num2));
                break;

                case 2:

                System.out.println("RESULTADO: " + Resta(num1,num2));
                break;

                case 3:
                System.out.println("RESULTADO: " + Multip(num1,num2));
                break;

                case 4:
                System.out.println("RESULTADO: " + Divi(num1,num2));
                break;

                case 0:
                System.out.println("Saliendo del Menu...");
                break;

                default:
                System.out.println("RESPUESTA INCORRECTA");
            }

        }while(respuesta != 0);



    }/// cierra el subprograma


    public static int Suma(int num1, int num2){
        int suma =num1+num2;
        return suma;
    }

    public static int Resta(int num1, int num2){
        int resta =num1-num2;
        return resta;
    }

    public static int Multip(int num1, int num2){
        int multip =num1*num2;
        return multip;
    }

    public static int Divi(int num1, int num2){
        int divi =num1/num2;
        return divi;
    }



}//// cierra la clase principal
  