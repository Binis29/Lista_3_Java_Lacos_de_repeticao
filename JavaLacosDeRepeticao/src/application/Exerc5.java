/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

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
		
		System.out.println("A soma dos números digitados é: "+ soma);
		
		sc.close();

	}

}
