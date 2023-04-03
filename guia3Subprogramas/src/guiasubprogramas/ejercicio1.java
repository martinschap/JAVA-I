/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiasubprogramas;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        Menu(num1,num2);

    }/// Cierra el main

    
    public static void Menu(int n1, int n2){

        Scanner leer = new Scanner(System.in);


        int respuesta;

        do{
            System.out.println("... MENU PRINCIPAL ...");
            System.out.println("1- SUMAR NUMEROS");
            System.out.println("2- RESTAR NUMEROS");
            System.out.println("3- MULTIPLICAR NUMEROS");
            System.out.println("4- DIVIDIR NUMEROS");
            System.out.println("0- SALIR");

            respuesta = leer.nextInt();

            switch(respuesta){
                case 1:
                System.out.println("RESULTADO: " + Suma(n1,n2));
                break;

                case 2:

                System.out.println("RESULTADO: " + Resta(n1,n2));
                break;

                case 3:
                System.out.println("RESULTADO: " + Multip(n1,n2));
                break;

                case 4:
                System.out.println("RESULTADO: " + Divi(n1,n2));
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