
/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
package application;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero, somaMultiplosTres =0, contador=0;
		
		do {
			
			System.out.println("Digite um valor: ");
			numero = sc.nextInt();
			
			if(numero%3 == 0 && numero!=0) {
				
				somaMultiplosTres += numero;
				
				contador++;
			}
			
		}while(numero!=0);
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+ (double) somaMultiplosTres/contador);
		sc.close();
	}

}
