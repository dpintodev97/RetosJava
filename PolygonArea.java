package Retos1;

import java.text.Normalizer;
import java.util.Locale;
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
	//Creación del Scanner para leer la entrada, además de configuración para que acepte "." en lugar de ","
	//con useLocale, US, cuando el user escriba un número decimal como entrada de los polígonos para calcular el área
        Scanner inputPoly = new Scanner(System.in).useLocale(Locale.US);
        String[] poly = {"triangulo", "cuadrado", "rectangulo"};

        while(true) {
            System.out.println("Dime, ¿qué área de un polígono quieres calcular? (aceptados: Triángulo, Cuadrado, Rectángulo): ");
            String selectedPoly = inputPoly.next();

            // Eliminar acentos y diacríticos y convertir a minúsculas
            selectedPoly = Normalizer.normalize(selectedPoly, Normalizer.Form.NFD)
                                   .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                                   .toLowerCase();
            // Verificar la entrada después del reemplazo
            System.out.println("Entrada después del reemplazo y conversión a minúsculas: " + selectedPoly); 
            
            //Para saber si el polígono elegido por el usuario es valido o no, uso esta variable booleana: 
            boolean valido = false;
            for(String p : poly ) {
                if(p.equalsIgnoreCase(selectedPoly)) {
                    valido=true;
                    break;
                }
            }
            if(valido) {
                System.out.println("Calcularé el área del " + selectedPoly);

                // Llamar al método calculaArea para obtener el área del polígono seleccionado por el user
                double area = calculaArea(selectedPoly, inputPoly);

                // Imprimir el resultado
                System.out.println("El área del " + selectedPoly + " es: " + area);
                break;
            } else {
                System.out.println("Escribe un polígono válido: Triángulo, Cuadrado o Rectángulo. Gracias");
            }
        }
        inputPoly.close(); // Cerrar el Scanner.
    }

	/**
	 * 	METODO CALCULAR AREA DE LOS POLIGONOS ACEPTADOS. Uso de switch case: 
	 * @param polygon
	 * @param input
	 * @return calculo de area de cada poligono o en caso de que no sea un polígono válido devuelva 0
	 */
    public static double calculaArea(String polygon, Scanner input) {
    	
    	// Declaración de variables locales fuera del switch. Después en cada case asigno valor :
    	float base, height, side, rectBase, rectHeight; 
    	double area = 0;
    	
        switch (polygon) {
            case "triangulo":
                System.out.println("Ingresa la base del triángulo:");
                base = input.nextFloat(); //para que acepte decimales como entrada
                System.out.println("Ingresa la altura del triángulo:");
                height = input.nextFloat();
                area = (base * height) / 2;
                break; // Agregar break al final de cada case para "cortar" con el control de flujo y evitar que
                		//el valor de area se sobrescriba en cada iteración.
            case "cuadrado":
                System.out.println("Ingresa el lado del cuadrado:");
                side = input.nextFloat();
                area = side * side;
                break; 
            case "rectangulo":
                System.out.println("Ingresa la base del rectángulo:");
                rectBase = input.nextFloat();
                System.out.println("Ingresa la altura del rectángulo:");
                rectHeight = input.nextFloat();
                area = rectBase * rectHeight;
                break; 
            default:
                return 0; // En caso de que se introduzca un polígono no válido lo controlamos con la impresión de 0
        }
     // Redondear el área a dos decimales
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }

}

