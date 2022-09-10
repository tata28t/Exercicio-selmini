import java.util.Scanner;

public class Exercicio_6_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int  alunos, ns;
		double media = 0, porcentagem = 0;
		
		
		System.out.println("Numero de salas -->");
		ns = teclado.nextInt();
		for(int i = 0; i < ns; i ++){
			System.out.println("Insira o numero de alunos da sala " +(i + 1)+ " -->" );
			alunos = teclado.nextInt();
			double[] notas = new double [alunos];
			media = inserir(notas, media);
			
			
			media = media/notas.length ;
			System.out.println("A média da sala foi " +String.format("%.3f", media) );
			
			porcentagem = percentual(notas, media, porcentagem);
				System.out.println(String.format("%.3f", porcentagem) + "%, ficaram acima da média da sala");
				media = 0;
				porcentagem = 0;
		}
		
		
		
		
		
		

	}
	
	public static double inserir(double notas[], double media) {
		Scanner teclado = new Scanner(System.in);
		for(int o = 0; o < notas.length; o ++) {
				System.out.println("Insira a nota do aluno " +(o + 1)+ " -->" );
				notas[o] = teclado.nextDouble();
				media += notas[o];
				
				
				
				
			}
		return media;
		
		
		
	}

	public static double percentual(double notas[], double media, double porcentagem) {
		for(int o = 0; o < notas.length; o ++) {
				if(notas[o] > media) {
					porcentagem++;
					}
				
				
			}
			porcentagem = (porcentagem/notas.length)* 100;
			return porcentagem;
		
	}
	
}
