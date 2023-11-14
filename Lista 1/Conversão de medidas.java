/******************************************************************************

10. Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1.760 jardas
Faça um programa que receba uma medida em pés, faça as
conversões a seguir e mostre os resultados.
a. polegadas;
b. jardas;
c. milhas.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int pes, polegadas, jardas, milhas, conversao;
	    
	  pes = Integer.parseInt(System.console().readLine());
	  polegadas = pes*12;
	  jardas = pes*3;
	  milhas = (1760*jardas);
	    System.out.println(polegadas);
		System.out.println(jardas);
     	System.out.println(milhas);
	}
}
