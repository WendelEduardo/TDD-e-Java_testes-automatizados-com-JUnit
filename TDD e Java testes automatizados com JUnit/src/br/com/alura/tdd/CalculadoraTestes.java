package br.com.alura.tdd;

public class CalculadoraTestes {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		int soma = calculadora.somar(2, 5);
		System.out.println(soma);
		
		soma = calculadora.somar(2, 0);
		System.out.println(soma);
		
		soma = calculadora.somar(0, 0);
		System.out.println(soma);
		
		soma = calculadora.somar(2, -1);
		System.out.println(soma);
		
		soma = calculadora.somar(2, -100);
		System.out.println(soma);
		
	}
	
}
