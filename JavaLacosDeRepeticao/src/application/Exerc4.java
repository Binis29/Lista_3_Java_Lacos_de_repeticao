/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

 */

package application;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, sexo, temperamento;
		int continua = 0, mulherNervosa=0, calma=0, homemAgressivo=0, pessoaCalma=0, pessoaNervosa=0;
		
		while(continua < 150) {
			
			System.out.println("Idade do indiv�duo: ");
			idade = sc.nextInt();
			
			System.out.println("Sexo:\n1 - Masculino\n2-Feminino");
			sexo = sc.nextInt();
			
			System.out.println("Temperamento:\n1 - Calma\n2 - Nervosa\n3 - Agressiva");
			temperamento =sc.nextInt();
			
			System.out.println();
			
			if(temperamento == 1) {
				calma++;
				
				if(idade < 18 && temperamento == 1) {
					pessoaCalma++;
				}
				
			} else if(sexo == 2 && temperamento == 2) {
				mulherNervosa ++;
				
			} else if(sexo == 1 && temperamento == 3) {
				homemAgressivo++;
				
			} else if(idade > 40 && temperamento == 2) {
				pessoaNervosa++;
			}
			
			continua++;	
		}
		
		System.out.println("N�mero de pessoas calmas: "+ calma);
		System.out.println("N�mero de mulheres nervosas: "+ mulherNervosa);
		System.out.println("N�mero de homens agressivos: "+ homemAgressivo);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+ pessoaNervosa);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+ pessoaCalma);
		
		sc.close();
		

	}

}
