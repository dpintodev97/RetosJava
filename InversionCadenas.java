package Retos1;

import java.util.Iterator;
import java.util.Scanner;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class InversionCadenas {

	public static void main(String[] args) {
		System.out.println("Dime una cadena de texto: ");
		Scanner input = new Scanner(System.in); //ENTRADA DEL USER
		
		String cadena = input.nextLine(); //ASIGNA A LA cadena, LA ENTRADA 
		
		String cadenaInv = invertir(cadena); //LLAMADA AL METODO invertir PARA INVERTIR LA CADENA
		
		System.out.println("Cadena invertida: " + cadenaInv);
		
		input.close(); // CIERRE DEL SCANNER
			
		}
	
	/**
	 * METODO PARA INVERTIR LOS CARACTERES DE UNA CADENA
	 * @param cadena
	 * @return cadenaInv (cadena con sus caracteres invertidos)
	 */
	
	public static String invertir(String cadena) {
		//1.CONVERTIR EL STRING EN UN ARRAY DE CHAR.
		char[] caracteres = cadena.toCharArray(); 
		
		//2.STRINGBUILDER PARA FORMAR LA cadena invertida:
		StringBuilder cadenaInv = new StringBuilder();
		
		
		//3. ITERAR SOBRE EL ARRAY DE CARACTERES, PERO EN ORDEN INVERSO (USANDO DECREMENTO):
		for(int i = caracteres.length - 1; i >= 0 ;i--) {
			cadenaInv.append(caracteres[i]);
		}
		System.out.println(); // Imprime un salto de línea al final
		
		//4.RETORNA CADENA INVERTIDA CONVERTIDA DE NUEVO EN STRING:
		return cadenaInv.toString();
		
		
		// *** StringBuilder *** : CLASE EN JAVA QUE SE USA PARA CONSTRUIR CADENAS DE CARACTERES.
		//EN JAVA, LAS CADENAS DE CARACTERES SON INMUTABLES, LO QUE SIGNIFICA QUE UNA VEZ QUE SE CREA UNA CADENA, 
		//NO SE PUEDE MODIFICAR. 
		//CADA VEZ QUE SE REALIZA UNA OPERACIÓN EN UNA CADENA (COMO CONCATENACIÓN), SE CREA UNA NUEVA CADENA EN MEMORIA
		//ENTONCES, StringBuilder, PERMITE CONSTRUIR CADENAS MODIFICABLES SIN CREAR OBJETOS ADICIONALES EN MEMORIA
		
		
//		// MOSTRAR ARRAY DE CARACTERES
//		for(char c : caracteres) { 
//			//char c : CADA ELEMENTO DE LA COLECCIÓN, SE ASIGNA A UN TIPO DE VARIABLE char LLAAMDA c EN CADA ITERACIÓN
//			//caracteres : ARRAY SOBRE EL QUE SE ITERA
//			System.out.println(c);
//		}
		
	}

}
