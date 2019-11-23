package com.teste;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		System.out.println("digite qual operaçao deseja");
		Scanner leitor = new Scanner(System.in);
		String resUser = leitor.nextLine();
		int num = Integer.parseInt(leitor.nextLine());
		int num2 = Integer.parseInt(leitor.nextLine());
		if (resUser.equals("1")){
			int resul =  cal.somar(num, num2);
			System.out.println(resul);
		}else if (resUser.equals("2")){
			
			int resul = cal.sub(num, num2);
			System.out.println(resul);
		}else if (resUser.equals("3")){
			
			int resul = cal.mult(num, num2);
			System.out.println(resul);
		}
		
		
leitor.close();
	}
	
}
