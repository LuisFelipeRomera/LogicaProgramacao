import java.util.Scanner;

public class cheques {

		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
			
			int cheque = 0;
			double valote = 0;
			double total = 0;
			int contador = 0;
			
			System.out.print("Informe a quantidade de cheques no lote: ");
			cheque = reader.nextInt();
			
			System.out.print("Informe o valor total do lote: ");
			valote = reader.nextDouble();
			
			do {
				
				System.out.print("Informe o valor de cada cheque individualmente: ");
				total += reader.nextDouble();
				
				contador++;
				
				System.out.print("Digite <0> para inserir mais cheques ou <1> para sair: ");
				
			} while (reader.nextInt() == 0);
			
			reader.close();
			
			if ((cheque == contador) && (valote == total)) {
				
				System.out.print("Valido");
				
				} else {
					
					System.out.print("Invalido");
					
				}
			
			
		}
}
