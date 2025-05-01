import java.util.Scanner;

public class RendaFamiliar {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double renda = 0;
		double fam = 0;
		
		double qtdA = 0;
		double qtdB = 0;
		double qtdC = 0;
		double qtdD = 0;
		double qtdE = 0;
		
		double pop = 0;
		
		double classe = 0;
		
		do {
			
			System.out.print("Informe a renda familiar: ");
			renda = reader.nextDouble();
			
			System.out.print("Informe a quantidade de integrantes da família: ");
			fam = reader.nextDouble();
			
			classe = (renda / fam);
			pop += fam;
			
			if (classe > 10000) {
				
				qtdA += fam;
				
			} else if (classe > 5000) {
				
				qtdB += fam;
						
			} else if (classe > 2000) {
				
				qtdC += fam;
				
			} else if (classe > 1000) {
				
				qtdD += fam;
				
			} else {
				
				qtdE += fam;
			
			}
			
			System.out.print("Digite <1> se houver mais familias para pesquisa: ");
			
		} while (reader.nextDouble() == 1);
		
		reader.close();
		
		System.out.println("Classe A: " + ((qtdA * 100) / pop));
		System.out.println("Classe B: " + ((qtdB * 100) / pop));
		System.out.println("Classe C: " + ((qtdC * 100) / pop));
		System.out.println("Classe D: " + ((qtdD * 100) / pop));
		System.out.println("Classe E: " + ((qtdE * 100) / pop));
		
	}

}
