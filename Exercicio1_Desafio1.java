package Exercicios_Desafio1;
import java.util.Scanner;

public class Exercicio1_Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira o primeiro lado do triângulo");
		a = ler.nextInt();
		System.out.println("Insira o segundo lado do triângulo");
		b = ler.nextInt();
		System.out.println("Insira o terceiro lado do triângulo");
		c = ler.nextInt();
		
		if(a>0 && b>0 && c>0 && (a+b)>=c && (a+c)>=b && (b+c)>=a) {
		
			if(a == b && b==c) {
				System.out.println("O triângulo é equilátero");
			}
			else if(a == b || b == c || a == c) {
				System.out.println("O triângulo é isósceles");
			}
			else {
				System.out.println("O triângulo é escaleno");
			}
		}
		
		else {
			System.out.println("Valores inválidos");
		}
	}

}
