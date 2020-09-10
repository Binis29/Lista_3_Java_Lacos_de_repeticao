/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

 */
package application;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, contador=0, contador21=0, contador50=0;
	
		while(idade != -99) {
			
			System.out.println("Entre com a idade da pessoa: ");
			idade = sc.nextInt();
			
			if (idade>120 || idade<0) {
			
				System.out.println("Número inválido!");
				
				} else if(idade>=0 && idade < 21) {
					contador21++;
					
				} else if(idade > 50) {
					contador50++;
					
				} else if(idade>=21 && idade <=50) {
					contador++;				
				}
		}
		
		System.out.printf("\nQuantidade de pessoas menores que 21 anos: %d ", contador21);
		System.out.printf("\nQuantidade de pessoas maiores que 50 anos: %d ", contador50);
		System.out.printf("\nQuantidade de pessoas entre 21 e 50 anos: %d ", contador);
		
		sc.close();

	}

}
