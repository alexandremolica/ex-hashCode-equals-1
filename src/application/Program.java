package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// Exemplo de hashCode e equals

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));

		System.out.println();

		Client c3 = new Client("Maria", "maria@gmail.com");
		Client c4 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c3.equals(c4));
		// Resultado abaixo falso pois faz referencia a 
		// posicao de memoria diferente 
		System.out.println(c3 == c4); 
		
		// Resultado abaixo true pois trata-se de comparacao
		// da literal nao do objeto
		System.out.println();
		
		String s1 = "test";
		String s2 = "test";
		System.out.println(s1 == s2); 
		

	}

}
