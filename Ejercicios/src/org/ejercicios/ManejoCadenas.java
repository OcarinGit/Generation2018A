package org.ejercicios;

public class ManejoCadenas {
	
	public boolean Palindromo(String cadena)
	{
		boolean isPalindromo=true;
		cadena=cadena.replace(" ", "");
		int mitadCadena=cadena.length()/2;
		
		for(int cont=0;cont<mitadCadena;cont++)
		{
			if(cadena.charAt(cont) != 			cadena.charAt(((cadena.length()-1)-cont)))
			{
				isPalindromo=false;
			}
		}
		return isPalindromo;
	}
}
