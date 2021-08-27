package valorMaioreMenor;

import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		int local;
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		n1 = leitor.nextInt();
		
		System.out.print("Segundo valor: ");
		n2 = leitor.nextInt();
		
		System.out.print("Terceiro valor: ");
		n3 = leitor.nextInt();
		
		System.out.println();
		//Valor Maoir
		
		if(n1>n2 && n1>n3) {
			local = n1;
			System.out.println("O valor maior é: " + local);
		}else if(n2>n3) {
			local = n2;
			System.out.println("O valor maior é: " + local);
		}else {
			local = n3;
			System.out.println("O valor maoir é: " + local);
		}
		
		//Valor menor
		if(n1<n2 && n1<n3) {
			local = n1;
			System.out.println("O valor menor é: " + local);
		}else if(n2<n3) {
			local = n2;
			System.out.println("O valor menor é: " + local);
		}else {
			local = n3;
			System.out.println("O valor menor é: " + local);
		}
		
	}

}
