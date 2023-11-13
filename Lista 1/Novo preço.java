/*******************************************************************************
Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%. 
Por exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos 10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o novo preço R$ 90,00.
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    double P1, D1, N1;
	    
	  P1 = Double.parseDouble(System.console().readLine());
      D1 = ((100*10)/100);
      
N1 = (P1-D1);

		System.out.println(N1);
	}
}
