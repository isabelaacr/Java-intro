/******************************************************************************

Um funcionário recebe um salário fixo mais 4% de comissão sobre as
vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
programa que receba o salário fixo do funcionário e o valor de suas
vendas, calcule e mostre a comissão e seu salário final


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int S1, V1, C1, SF;
	    
	  S1 = Integer.parseInt(System.console().readLine());
	  V1 = Integer.parseInt(System.console().readLine());
      C1 = (V1*4)/100;
      
SF = (S1+C1);

		System.out.println(SF);
	}
}
