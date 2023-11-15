/******************************************************************************

O custo ao consumidor de um carro novo é a soma do preço de fábrica 
com o percentual de lucro do distribuidor e dos impostos aplicados ao 
preço de fábrica. Faça um programa que receba o preço de fábrica de 
um veículo, o percentual de lucro do distribuidor e o percentual de 
impostos, calcule e mostre:
a. o valor correspondente ao lucro do distribuidor;
b. o valor correspondente aos impostos;
c. o preço final do produto.


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    float preco_fabrica, lucro, impostos, percentual_lucro, percentual_impostos, preco_final;
	    
	  preco_fabrica = Float.parseFloat(System.console().readLine());
	  lucro = Float.parseFloat(System.console().readLine());
	  impostos = Float.parseFloat(System.console().readLine());
      percentual_lucro = (preco_fabrica*lucro)/100;
      percentual_impostos = (preco_fabrica*impostos)/100;
	  preco_final = preco_fabrica+percentual_lucro+percentual_impostos;
	    
     	System.out.println(preco_final);
	}
}
