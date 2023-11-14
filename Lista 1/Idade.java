/******************************************************************************

11. Faça um programa que receba o ano de nascimento de uma pessoa e o
ano atual, calcule e mostre:
a. a idade dessa pessoa em anos;
b. a idade dessa pessoa em meses;
c. a idade dessa pessoa em dias (considerando que cada ano
possui 365 dias);
d. a idade dessa pessoa em semanas (cada ano possui 52
semanas).


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int nascimento, ano_atual, idade_anos, idade_meses, idade_dias, idade_semanas;
	    
	  nascimento = Integer.parseInt(System.console().readLine());
	  ano_atual = Integer.parseInt(System.console().readLine());

	  idade_anos = ano_atual-nascimento;
	  idade_meses = idade_anos*12;
	  idade_dias = idade_anos*365;
	  idade_semanas = idade_anos*52;	  
	    System.out.println(idade_anos);
		System.out.println(idade_meses);
     	System.out.println(idade_dias);
     	System.out.println(idade_semanas);
	}
}
