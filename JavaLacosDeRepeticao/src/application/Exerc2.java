/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */

package application;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, contadorPar=0, contadorImpar=0;
		
		for(int i=1; i<=10; i++){
			System.out.println("Digite um n�mero inteiro maior que zero: ");
			numero = sc.nextInt();
			
			if(numero%2 == 0){
				contadorPar++;
			} else {
				contadorImpar++;
			}
			}
		
		System.out.printf("Aquantidade de n�meros pares � %d, e a quantidade de n�meros �mpares � %d.",contadorPar, contadorImpar);
		
		sc.close();
		
		}
		
		

}
