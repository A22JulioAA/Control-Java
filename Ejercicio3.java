/*Ejercicio 3 Crea un método estático denominado esPalindromo( ) que nos diga si 
una cadena es palíndromo o no. Una cadena es palíndromo si se lee igual de izquierda 
a derecha que de derecha a izquierda. Por ejemplo, las cadenas “ana”, “Ana” 
y “Oí lo de mamá: me dolió” son palíndromos. 

Ten en cuenta que en la frase podrá haber diferentes signos de puntuación y espacios 
que deben ser descartados. El método no debería distinguir tampoco entre una vocal con 
tilde o sin ella ni mayúsculas de minúsculas. */

/**
 * @author Julio
 */

import java.util.*;

public class Ejercicio3 {

    public static boolean esPalindromo(String cadena) {

        //Trabajamos con la cadena pasada por parámetros para convertirla a mayúscula y luego usar la función replace() para cambiar tanto los acentos como los puntos, espacios... (La parte de eliminar caracteres que no fuesen letras o números no supe hacerlo)

        cadena = cadena.toUpperCase().replace("Á", "A").replace("É", "E").replace("Í", "I").replace("Ó", "O")
                .replace("Ú", "Ú").replace(",", "").replace(" ", "").replace(".", "");

        //Creamos una segunda cadena que será la que invertiremos con StringBueilder y su método reverse()

        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        //Valoramos, si la cadena invertida y la original son iguales será un palíndromo. Sino, no.

        if (cadenaInvertida.equals(cadena)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Llamamos a la clase y le pasamos por parámetros las frases a valorar.

        System.out.println(esPalindromo("Amad a la dama"));
        System.out.println(esPalindromo("Alí tomo tila"));
        System.out.println(esPalindromo("Esto es un palíndromo"));

        sc.close();

        //La parte de cambiar otros caracteres no supe hacerla. traté de usar otro replace o replaceAll y una expresión regular ^(A-Z0-9) pero no conseguí que substituyera los caracteres. Creo que es posible de esta
        //forma pero algo debe de estar mal y no se lo que es

    }

}
