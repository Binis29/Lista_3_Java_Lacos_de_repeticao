/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */

package application;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, contadorPar=0, contadorImpar=0;
		
		for(int i=1; i<=10; i++){
			System.out.println("Digite um número inteiro maior que zero: ");
			numero = sc.nextInt();
			
			if(numero%2 == 0){
				contadorPar++;
			} else {
				contadorImpar++;
			}
			}
		
		System.out.printf("Aquantidade de números pares é %d, e a quantidade de números ímpares é %d.",contadorPar, contadorImpar);
		
		sc.close();
		
		}
		
		

}
