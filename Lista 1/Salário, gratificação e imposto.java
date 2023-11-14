/******************************************************************************

Faça um programa que receba o salário base de um funcionário, calcule
e mostre o salário a receber, sabendo-se que o funcionário tem
gratificação de 5% sobre o salário base (que será acrescentado ao
salário) e paga imposto de 7% sobre este salário (o que será
descontado do salário).


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    float S1, G1, I1, SF;
	    
	  S1 = Float.parseFloat(System.console().readLine());
      G1 = (S1*5)/100;
      I1 = (S1*7)/100;
      
SF = (S1+G1-I1);

		System.out.println(SF);
	}
}
