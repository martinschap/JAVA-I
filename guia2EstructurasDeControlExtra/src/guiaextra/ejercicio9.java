package guiaextra;

import java.util.Scanner;

/*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente
y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
public class ejercicio9 {

    /**
     * @param args
     */
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, coc = 0;
        System.out.println("Ingrese el dividendo");
        num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        num2 = leer.nextInt();
        int resto = num1;
        if (num2 == 0){
            System.out.println("Es imposible dividir por 0");
        }
        else{
            while (resto >= num2){
                resto = resto - num2;
                coc++;
            }
            System.out.println("El resto es: " +resto);
            System.out.println("El cociente es: " +coc);               
        }
        leer.close();
    }
}
