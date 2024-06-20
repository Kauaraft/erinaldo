import java.util.Scanner;

public class Cidadesrec {
	Scanner sc = new Scanner (System.in);
	String nome;
	int identificador, veiculodepasseio, qntddeacidentes;
	
	public Cidadesrec (String nome ) {
		System.out.println("Qual o nome da cidade ?: ");
		nome = sc.next();
		
		System.out.println("Qual o código da cidade ?: ");
		identificador = sc.nextInt();
		
		System.out.println("Quantos veiculos de passeio tem na cidade ?: ");
		veiculodepasseio = sc.nextInt();
		
		System.out.println("Qual a quantidade de acidentes?: ");
		qntddeacidentes = sc.nextInt();
	}
}

