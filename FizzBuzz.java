package Retos1;

/**
 * Esta clase implementa el reto FizzBuzz.
 * Imprime los números del 1 al 100, con las siguientes reglas:
 * 	 Si el número es múltiplo de 3, imprime "Fizz".
 * 	 Si el número es múltiplo de 5, imprime "Buzz".
 * 	 Si el número es múltiplo de 3 y 5 a la vez, imprime "FizzBuzz".
 *
 * @author David
 * @version 1.0
 */
public class FizzBuzz {
	
	public static void main(String[] args) {
		//BUCLE FOR; num.1-100:
		for (int i = 1; i < 100; i++) {
			//x num i es múltiplo de otro num si se puede dividir por ese otro número sin dejar resto (0)
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else {
				//IMPRIME EL NUM:
				System.out.println(i);
			}
		}
	}
}
