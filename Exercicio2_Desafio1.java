package Exercicios_Desafio1;

public class Exercicio2_Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma=0, QuadradoSoma=0, SomaQuadrado=0;
		
		
		for(int i=0; i<=10; i++) {
			soma += i;
			SomaQuadrado= SomaQuadrado+(i*i);
		}
		
		QuadradoSoma= soma*soma;
		int Diferen�a = QuadradoSoma-SomaQuadrado;
		
		System.out.println("A diferen�a entre o quadrado da soma e a soma dos quadrados dos 10 primeiros n�meros naturais �: " + Diferen�a);
	}

}
