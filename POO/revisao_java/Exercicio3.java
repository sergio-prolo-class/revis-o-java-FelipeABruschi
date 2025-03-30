import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Entre com a quantidade de alunos: ");
	int alunos = teclado.nextInt();
	
	double[] notas = new double[alunos];
	
	System.out.print("Entre com a nota de cada aluno: ");
	
	for(int i = 0; i < alunos; i++) 
		notas[i] = teclado.nextDouble();
	
		
	int abaixo_3 = 0, abaixo_6 = 0, abaixo_9 = 0, maior_9 = 0;
	
	for (int i = 0; i < alunos; i++) {
            if (notas[i] < 3)
            	abaixo_3++;
            else if (notas[i] < 6) 
                abaixo_6++;
            else if (notas[i] < 9)
                abaixo_9++;
            else
                maior_9++;
        }
        
        System.out.println("0 - 2  | " + "*".repeat(abaixo_3));
        System.out.println("3 - 5  | " + "*".repeat(abaixo_6));
        System.out.println("6 - 8  | " + "*".repeat(abaixo_9));
        System.out.println("9 - 10 | " + "*".repeat(maior_9));
        
	}
}

