package principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite um ano para saber se é bissexto: ");
		ano = sc.nextInt();
		
		sc.close();
		
		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
	}

}
