package principal;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("Entre com o primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Entre com o segundo n�mero: ");
		num2 = sc.nextInt();
		System.out.print("Entre com o terceiro n�mero: ");
		num3 = sc.nextInt();
		sc.close();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		} else if (num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		} else {
			System.out.println("O maior n�mero �: " + num3);
		}
		
		
	}

}
