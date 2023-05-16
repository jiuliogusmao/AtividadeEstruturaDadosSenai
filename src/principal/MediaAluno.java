package principal;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Entre com a quarta nota: ");
		nota4 = sc.nextDouble();
		sc.close();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media < 6) {
			System.out.println(media + " Reprovado.");
		} else if (media >= 6 && media < 7) {
			System.out.println(media + " Recuperação.");
		} else if (media >= 7 && media <10) {
			System.out.println(media + " Aprovado.");
		} else {
			System.out.println(media + " Aprovado.");
			
		}
	}

}
