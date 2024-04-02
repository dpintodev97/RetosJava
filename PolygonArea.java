package Retos1;

import java.text.Normalizer;
import java.util.Scanner;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class PolygonArea {

	public static void main(String[] args) {
		Scanner inputPoly = new Scanner(System.in);
		String[] poly = {"triangulo", "cuadrado", "rectangulo"};
		
		while(true) {
			System.out.println("Dime, ¿qué area de un polígono quieres calcular?(aceptados: Triángulo, Cuadrado, Rectángulo): ");
			String selectedPoly = inputPoly.next();
			
			// Eliminar acentos y diacríticos y convertir a minúsculas
            selectedPoly = Normalizer.normalize(selectedPoly, Normalizer.Form.NFD)
                                   .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                                   .toLowerCase();
			System.out.println("Entrada después del reemplazo y conversión a minúsculas: " + selectedPoly); // Verificar la entrada después del reemplazo
			
			
			
			//VALIDAR ENTRADA USUARIO CON UN BOOLEANO:
			boolean valido = false;
			for(String p : poly ) {
				if(p.equalsIgnoreCase(selectedPoly)) {
					valido=true;
					break;
				}
			}
			if(valido) {
				System.out.println("Calcularé el área del " + selectedPoly);
				break;
			}else {
				System.out.println("Escribe un polígono válido: Triángulo, Cuadrado o Rectángulo. Gracias");
			}
		}
		inputPoly.close(); // CLOSE SCANNER.
	}

}
