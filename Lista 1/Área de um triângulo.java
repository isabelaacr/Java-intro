/******************************************************************************

8. Faça um programa que calcule e mostre a área de um triângulo. 
Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser informadas
pelo usuário

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	  int base, altura, area;
	    
	  base = Integer.parseInt(System.console().readLine());
	  altura = Integer.parseInt(System.console().readLine());

      area = (base*altura)/2;
      
		System.out.println(area);
	}
}
