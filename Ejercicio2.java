/*Ejercicio 2  Diseña un programa que, en primer lugar, le pida al usuario que escriba
un carácter cualquiera (letra, dígito,...). A continuación, aceptará entradas del usuario
hasta que éste escriba la secuencia “<END>”.

El programa mostrará cuántas ocurrencias del carácter se produjeron en el texto introducido 
hasta la aparición de dicha secuencia.*/

/**
 * @author Julio
 */

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Creamos las variables necesarias para el programa e inicamos el Scanner.
        
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int contador = 0;
        String cadena = "";
        String escape = "<END>";

        //Pedimos el carácter a buscar
        
        System.out.println("Introduce un caracter cualquiera: ");
        char c = sc.next().charAt(0);

        //Pedimos las cadenas en las que buscar e informamos sobre como salir del programa.
        
        System.out.println("Introduce las cadenas en las que quieras buscar el caracter: ");
        System.out.println("'<END>' para salir");

        do {

            //Recogemos las cadenas y eliminamos espacios antes y después de esta.

            cadena = sc.nextLine();

            cadena = cadena.trim();

            //Valoramos si la cadena es directamente el escape. De ser así le damos a salir el valor true para que salga del programa

            if(cadena.equals(escape)){

                exit = true;

            }else if(cadena.indexOf(escape) != -1){ //Valoramos el valor que nos devuelve indexOf de escape. Si el valor es -1, significará que no lo ha encontrado y por tanto seguirá el programa, si no, saldrá.
                cadena = cadena.substring(0, cadena.indexOf(escape)); //En caso de encontrar el escape, se valorará si existe una cadena antes de este.
                
                if(cadena.indexOf(c) != -1){ //Si existe la cadena se buscará el caracter y en caso de encontrarlo se aumentará el contador
                    contador++;
                }

                exit = true;
            }else if(cadena.indexOf(c) != -1){ //Simplemente si encuentra el caracter se sumará el contador
                contador++;
            }
            
        } while (!exit);

        //Imprimimos el contador, que resulta el número de veces que el valor fue encontrado en las cadenas

        System.out.println(contador);

        sc.close();
    }
}
