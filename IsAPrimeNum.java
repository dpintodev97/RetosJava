package Retos1;

import java.util.Scanner;
/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class IsAPrimeNum {

	public static void main(String[] args) {
		//1. OPEN SCANNER TO ASK TO USER:
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("Tell me some number (only valid int: 0,1,2...): ");
			if(input.hasNextInt()) {
				num = input.nextInt();
				break;
			}else {
				input.nextLine(); //Clean buffer from Scanner and advance to the next line.
				//Without this line, the program would enter an infinite loop !
				//due to the presence of the unconsumed "line break" in the input buffer
				System.out.println("Just valid int. Try again");
			}
		}
		//2. num is PRIME or NOT ?.
		if(isPrime(num)) {
			System.out.println(num + " is prime");
		}else {
			System.out.println(num + " is not prime");
		}
		//3. PRIME numbers between 1 - 100:
		System.out.println("I will tell you the prime numbers between 1-100: ");
		for(int i = 1; i <=100; i++) {
			if(isPrime(i)) {
				System.out.println(i + " is prime");
			}
		}
	}
	//***** method to find out if the entered number is prime:  *****
	/**
	 *  A prime number has only two divisors: 1 and itself. Control special cases:
	 *  1. If the number is less than or equal to 1, it is not prime
	 *  2. If the number is equal 2, it's prime
	 *  3. All even numbers greater than 2 are not prime
	 *  Then, verify the divisibility of the given number by all odd numbers from 3 
	 *  to the square root of that number
	 * @param number
	 * @return boolean
	 */
	public static boolean isPrime(int number) {
		// If the number is less than or equal to 1, it is not prime
		if(number <= 1) {
			return false;
		}
		// If the number is equal 2, it's prime
		if(number == 2) {	
			return true;
		}
		//All even numbers greater than 2 are not prime
		if(number % 2 == 0) {
			return false;
		}
		//verify the divisibility of the given number by all odd numbers from 3 to the square 
		//root of that number :  *********************
		for(int i = 3; i * i <= number;i+=2) {
			if(number % i == 0) {
				return false;
			}
		//1. i : starts from 3 (avoiding 2 because we have already verified its divisibility) 
		//and goes from 2 to 2 to consider only odd numbers (3...then 5...then 7...)
		//2. Loop condit.:continues as long as the square of i is less than or equal to number. 
		//Stops the loop when i is greater than the square root of number.
		//example: number: 25; i*i (3*3)= 9; then, 5*5=25
		//3. Divisibility check: At each iteration, it checks if number is divisible by i. 
		//If it finds a divisor, it returns false, which means that number is not prime.
		}
		return true; //number is prime; if the for loop completes all its iterations 
		//without finding a divisor for number, that means that number is not divisible 
		//by any number smaller than its square root (except 1 and the number itself), 
		//indicating that number is prime. 
	}
	
}
