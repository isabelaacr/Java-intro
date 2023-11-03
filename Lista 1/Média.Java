/*******************************************************************************
Faça um programa que receba três notas de um estudante, calcule e 
mostre a média aritmética entre elas (este exercício é similar ao exemplo 
mostrado a neste capítulo, mas leva em consideração três notas e não 
quatro).
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    double N1, N2, N3, RES;
	    
	  N1 = Double.parseDouble(System.console().readLine());
      N2 = Double.parseDouble(System.console().readLine());
      N3 = Double.parseDouble(System.console().readLine());
      
RES = (N1+N2+N3)/3;

		System.out.println(RES);
	}
}
