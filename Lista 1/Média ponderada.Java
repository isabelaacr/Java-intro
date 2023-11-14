/******************************************************************************

Faça um programa que receba três notas e seus respectivos pesos,
calcule e mostre a média ponderada dessas notas. Para calcular a
média ponderada, multiplique cada nota por seus respectivos pesos,
some todos os resultados e divida pela soma dos pesos. 
Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do
estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. 
Esse valor deve ser dividido pela soma dos pesos (6), resultando em
6,3.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    float N1, N2, N3, MEDIA;
	    
	  N1 = Float.parseFloat(System.console().readLine());
	  N2 = Float.parseFloat(System.console().readLine());
	  N3 = Float.parseFloat(System.console().readLine());

      MEDIA = (N1*1+N2*2+N3*3)/6;
      
		System.out.println(MEDIA);
	}
}
