import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double largura, comprimento, metroQuadrado;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("AREA = %.2f%n", area );
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		sc.close();

	}

}
