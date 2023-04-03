package guiasubprogramas;


import java.util.Scanner;
public class ejercicio3 {

    /**
    Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
    * estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros
    * y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda = "";  
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = leer.nextFloat();
        menu(euros, moneda);
        
    }
    
    public static void cambioDeDivisas (float euros, String moneda){
        
        if ("Libras".equals(moneda)) {
            System.out.println(""+euros +" son "+euros*0.86+" libras");
        }
        else if ("Dolares".equals(moneda)) {
            System.out.println(""+euros +" son "+euros*1.28611+" dolares");
        }
        else if ("Yenes".equals(moneda)) {
            System.out.println(""+euros +" son "+euros*129.852+" yenes"); 
        }
        else{
            System.out.println("No ingresó una moneda valida");
        }
        
                
        
        }
    
    public static void menu (float euros, String moneda){
        int rta;
        boolean error = false;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese el tipo de moneda que desea ver convertido ");
            System.out.println("1 --- LIBRAS");
            System.out.println("2 --- DOLARES");
            System.out.println("3 --- YENES");
            System.out.println("0 --- SALIR");
            rta = leer.nextInt();
            if (rta > 3 || rta < 0) {
                System.out.println("Error. Ingrese un tipo de moneda ");
            }
            else {
                 switch(rta){
                    case 1:
                        moneda = "Libras";
                        cambioDeDivisas(euros,moneda);
                         break;
                     case 2:
                         moneda = "Dolares";
                         cambioDeDivisas(euros,moneda);
                         break;
                    case 3:
                         moneda = "Yenes";
                         cambioDeDivisas(euros,moneda);
                         break;
                    case 0:
                        moneda = "Salir";
                        break;
                 }
            }
               
      } while (rta != 0);
        
        
        
        
        
    }
}
