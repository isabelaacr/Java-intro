/******************************************************************************

Faça um programa que receba dois números, calcule e mostre a divisão 
do primeiro pelo segundo. Sabe-se que o segundo número não pode ser 
zero, portanto, não é necessário se preocupar com isso neste exercício.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    double N1, N2, RES;
	    
	  N1 = Double.parseDouble(System.console().readLine());
      N2 = Double.parseDouble(System.console().readLine());

RES = (N1/N2);

		System.out.println(RES);
	}
}
