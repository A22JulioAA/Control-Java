/*Ejercicio 1 -  Escribe un programa que solicite al usuario la introducción 
de valores numéricos (uno por línea) con Scanner hasta que se introduzca el valor 00.

A continuación, se mostrará la suma, la media, el mayor y el menor de los valores introducidos.*/

/**
 * @author Julio
 */

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Iniciamos el Scanner y creamos todas las variables necesarias para el programa.

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        double suma = 0;
        double media = 0;
        String valor = "";
        int contador = 0;
        double mayor = -99999;
        double menor = 10000;

        //Pedimos los datos hasta que se introduzca la cadena "00", que hará que el programa termine e imprima todos los resultados.

        System.out.println("Introduce los valores hasta que quieras salir(00): ");

        //Usamos un try catch para capturar posibles errores en el programa.

        try {

            do{

                //Le damos a "valor" el valor del dato introducido por consola y eliminamos la posible "," y substituimos por un ".". También eliminamos espacios en blanco el principio o final con trim().
    
                valor = sc.nextLine();
                valor = valor.replace(',', '.');
                valor = valor.trim();
    
                //Mediante una condición evaluamos si se introduce un dato o si se pide terminar el programa
    
                if(valor.equals("00")){
                    exit = true;
                }else{
    
                    //Hacemos la suma con el valor introducido, el contador suma 1 unidad para luego hacer la media y se crea una condición para evaluar cual es el mayor y el menor número de los introducidos
    
                    suma += (Double.parseDouble(valor));
                    contador+=1;
    
                    if(Double.parseDouble(valor) > mayor){
                        mayor = Double.parseDouble(valor);
                    }else if(Double.parseDouble(valor) < menor){
                        menor = Double.parseDouble(valor);
                    }
    
                }
    
            }while(exit == false);
    
            //Se imprimen los datos por pantalla
    
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + (suma/contador));
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
    
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Ha habido un error! Puede que no hayas introducido un número o que la cadena no sea correcta...");
        }

    } 
    
}
