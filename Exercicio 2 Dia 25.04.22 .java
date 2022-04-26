package Lista2;
import java.util.Scanner;
public class Aula6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Criação de Scanner tipo que deve ser inserido pelo usuario
		Scanner condição=new Scanner(System.in);
		// Dado a ser inserido futuramente
		int n1;
		// Texto exposto ao cliente, dando 4 opcoes para que ele opte pela opcao que ele se encontra
		System.out.print("Boa noite, para que possamos te colocar na vaga correta informe seu estado de saude\n Caso seja idosa digite -> 1 <-\n Caso seja deficiente digite -> 2 <-"
				+ "\n Caso seja gestante digite -> 3 <-\n caso não tenha nenhum problema de saude digite -> 4 <-\n Digite o numero correspondente a sua saude:");
		n1 = condição.nextInt();
		// Scanner recebido \\
		
		// Resolução do problema com variacao ou , utilizando um simples metodo de escolha do usuario
		if (n1 == 1 || n1 == 2 || n1== 3 || n1== 4 ) 
		System.out.printf("Você tem direito a uma vaga preferencial");
		else // caso contrario nao tem direito a vaga preferencial
			System.out.print("Vaga comum.");
		
		
		
		
		
	}

}
