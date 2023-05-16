package principal;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("Entre com o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Entre com o segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Entre com o terceiro número: ");
		num3 = sc.nextInt();
		sc.close();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
		} else if (num2 > num3) {
			System.out.println("O maior número é: " + num2);
		} else {
			System.out.println("O maior número é: " + num3);
		}
		
		
	}

}
