package Retos1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 * @author David
 * @version 1.0
 */
public class Anagrama {
	public static void main(String[] args) {
		//** ABRIR SCANNER PARA RECIBIR PALABRAS DEL USUARIO **:
		Scanner entrada = new Scanner(System.in);
		
		// 1-PEDIR AL USER LA PRIMER PALABRA:
        String p1 = solicitarPalabra(entrada, "primera");
        //System.out.println(p1);

        // 2-PEDIR AL USER LA SEGUNDA PALABRA
        String p2 = solicitarPalabra(entrada, "segunda");
        
        System.out.println("Palabras válidas! : " + p1 + ", " + p2);
        
        //RESULTADO BOOLEAN AL LLAMAR AL METODO validarAna Y COMPARAR :
        boolean esAnag = validarAnag(p1, p2);
        System.out.println("¿Las palabras " + p1 + " y " + p2 + " son anagramas?: " + esAnag);
        
    }
// ********** METODO PUBLIC PARA PEDIR AL USER LA PALABRA Y VALIDAR *********
	/**
	 * Metodo para solicitar una palabra al usuario (no acepte números o símbolos)
	 * @param entrada Un objeto de tipo Scanner para recibir la entrada del usuario
	 * @param ordinal Un objeto de tipo String para describir la posicion de la palabra (primera, segunda)
	 * @return palabra de tipo String introducida por el usuario
	 */
    public static String solicitarPalabra(Scanner entrada, String ordinal) {
        String palabra = ""; //INICIALIZA CADENA VACIA; VARIABLE PARA ALMACENAR LA PALABRA
        
        //BUCLE INFINITO WHILE: EN EL MOMENTO QUE SEA VALIDA LA PALABRA, HACE BREAK; 
        //SI NO, SIGUIE PIDIENDO AL USER :
        while (true) {
            System.out.println("Introduzca una " + ordinal + " palabra válida (texto a-z): ");
            palabra = entrada.nextLine();
            
            // VALIDAR QUE LA PALABRA SOLO TENGA LETRAS, MINUS/MAYUSCULAS.
            if (palabra.matches("[a-zA-ZñÑáéíóúüÁÉÍÓÚÜçÇ]+")) {
                break;
            } else {
                System.out.println("La palabra contiene caracteres no válidos. Vuelva a intentarlo!(texto a-z):");
            }
        }
        return palabra;
    }
// ******** METODO PARA VALIDAR SI LAS PALABRAS RECIBIDAS SON ANAGRAMAS***************
    /**
     * Metodo para saber si la palabra es un Anagrama (palabra que se puede crear al reordenar 
     * las letras de otra palabra) o no es un Anagrama
     * @param palabra1
     * @param palabra2
     * @return boolean
     */
    public static Boolean validarAnag(String palabra1, String palabra2) {
    	//NECESITO ORDENARLAS; POR ESO TRANSFORMO LAS PALABRAS EN ARRAYS DE CARACTERES
    	//toCharArray: CONVIERTE CADA PALABRA EN UN ARRAY DE CARACTERES y ASI SE PUEDE COMPARAR LAS LETARS
    	char[] p1Array = palabra1.toLowerCase().toCharArray();
    	char[] p2Array = palabra2.toLowerCase().toCharArray();
    	//ORDENAR CADA ARRAY NUEVO DE CARACTERES:
    	Arrays.sort(p1Array);
    	Arrays.sort(p2Array);
    	//RETORNA LA COMPARACIÓN DE ARRAYS DE CARACTERES (CON equals PARA SABER SI SON IGUALES):
		return Arrays.equals(p1Array, p2Array);
		
    }
}
