package Retos1;

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
        
        System.out.println("Palabras válidas: " + p1 + ", " + p2);
        
        
        
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
    public static Boolean validarAnag(String palabra1, String palabra2) {
    	
		return null;
    	
    }
		
		
	
	
}
