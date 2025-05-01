import java.util.Scanner;

public class TrianguloAsterisco {

		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			int tam = 0;
			
			System.out.print("Digite o tamanho do triângulo: ");
			tam = reader.nextInt();
			
			reader.close();
			
			if (tam < 1) {
				
				System.out.println("Digite um valor maior que 0");
				
				return;
			}
			
			for (int i = 0; i < tam; i++) {
				
				for (int j = 0; j <= i; j++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
				
			}
		}
}
