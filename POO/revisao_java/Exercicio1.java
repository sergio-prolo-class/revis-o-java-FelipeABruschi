import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite seu ano de nascimento: ");
		int ano_nascimento = teclado.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int ano_atual = teclado.nextInt();
		
		System.out.printf("%s tem %d anos\n",nome, ano_atual - ano_nascimento);
	}

}
