package Exercicios_Desafio1;
public class Exercicio3_Desafio1 {
public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
		
	int num;
		
	System.out.println("Insira um número");
	num = ler.nextInt();
		
	Integer.toString(num);
	
	String rain = "";
		
	if (num % 3 == 0) {
            rain += "Pling";
        }
        if (num % 5 == 0) {
            rain += "Plang";
        }
        if (num % 7 == 0) {
            rain += "Plong";
        }
        if (rain== "");
		
        System.out.println(rain);
		
		}
	}

