package br.senai.sp.jandira;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalcImc {
	public static void main(String[] args)  {
		
		// Criação das variáveis
		
		Scanner leitor = new Scanner(System.in);
		
		double peso, altura, imc;
		String auxilio;
		String alturaa;
		
		
		//System.out.println("Qual é o seu peso?");
		auxilio = JOptionPane.showInputDialog(null,
				"Qual é o seu peso?",
				"Calculadora IMC",
				JOptionPane.QUESTION_MESSAGE); 
		
		System.out.println(auxilio);
		
		peso = Double.parseDouble(auxilio);
				//leitor.nextDouble();
		
		
		//System.out.println("Qual é o seu peso?");
		alturaa = JOptionPane.showInputDialog(null,
				"Qual sua altura?",
				"Calculadora IMC",
				JOptionPane.QUESTION_MESSAGE); 
		
		System.out.println(alturaa);
		
		//System.out.println("Qual sua altura?");
		altura = Double.parseDouble(alturaa); //leitor.nextDouble();
		
		imc = peso / Math.pow(altura, 2.0);
		
		//System.out.printf("Seu imc é: %s", String.format("%.2f", imc));
		
		if (imc <= 18.5){
			alturaa = ("\nVocê esta abaixo do peso");	
		}//System.out.printf
		
		if (imc >= 18.6 && (imc <= 24.9)){
			alturaa = ("\nVocê esta no peso ideal, Parabens ");
			//System.out.printf
		}
			
		if (imc >= 25.0 && (imc <= 29.9)) {
			alturaa = ("\nAtenção! Você esta levemente acima do peso");
			//System.out.printf	
		}
		/*} else if (imc <= 29.9); 
		System.out.printf("\nAtenção! Você esta levemente acima do peso");*/
		
		if (imc >= 30.0 && (imc <= 34.9)) {
			alturaa = ("\nAtenção! Você esta na Obesidade grau I");
			//System.out.printf	
		}
		
		if (imc >= 35.0 && (imc <= 39.9)){
			alturaa = ("\nAtenção! Você esta na Obesidade grau II considerada severa.");
			//System.out.printf	
		}
		
		if (imc >= 40.0){
			alturaa = ("\nAtenção! Você esta  na Obesidade grau III considerada mórbida");
			//System.out.printf	
		}
		alturaa = alturaa + "seu IMC é " + String.format("%.2f", imc) ;
		JOptionPane.showMessageDialog(null, alturaa,
				"RESULTADO",
				JOptionPane.INFORMATION_MESSAGE);
				
	leitor.close();
	}

	
}


