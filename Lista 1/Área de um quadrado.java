/******************************************************************************

9. Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que
𝐴 = lado^2


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int area, lado;
	    
	  lado = Integer.parseInt(System.console().readLine());
	  
	  area = (lado*lado);
		System.out.println(area);
	}
}
