/******************************************************************************
1. Faça um programa que leia dois valores numéricos inteiros e apresente 
o resultado da diferença do maior valor pelo menor valor. Se os valores 
forem iguais, o programa deve mostrar zero.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int n1, n2;
	    
	  n1 = Integer.parseInt(System.console().readLine());
	  n2 = Integer.parseInt(System.console().readLine());
	  
      if  (n1 != n2)
	  System.out.println (n1-n2);
	  else System.out.println (0);
	
	}
}
