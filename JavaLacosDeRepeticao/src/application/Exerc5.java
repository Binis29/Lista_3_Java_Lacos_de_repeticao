/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

 */
package application;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		double numero, soma= 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Digite um valor: ");
			numero =sc.nextDouble();
			
			soma += numero;
			
		}while(numero !=0);
		
		System.out.println("A soma dos n�meros digitados �: "+ soma);
		
		sc.close();

	}

}
