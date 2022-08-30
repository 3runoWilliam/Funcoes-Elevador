package visao;
import dominio.Elevador;
import java.util.Scanner;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		Elevador usuario = new Elevador();
		Scanner entrar = new Scanner(System.in);
		
		usuario.inicializar(5, 10);
		
		int opc = -1;
		
		do {
			
			System.out.println("----DIGITE A FUNÇÃO DESEJADA----");
			System.out.println("1 - ENTRAR");
			System.out.println("2 - SAIR");
			System.out.println("3 - SUBIR");
			System.out.println("4 - DESCER");
			System.out.println("0 - FECHAR");
			System.out.println("--------------------------------");
			
			opc = entrar.nextInt();
			
			switch(opc) {
			
			case 1:
				
				System.out.println("VOCE ENTROU NO ELEVADOR  \n");
				usuario.entrar();
				
				System.out.println("QUANTIDADES DE PESSOAS NO ELEVADOR: " + usuario.getQuantPessoas() + "\n");
				
				break;
			case 2:
				
				System.out.println("VOCE SAIU DO ELEVADOR \n");
				usuario.sair();
				
				System.out.println("QUANTIDADES DE PESSOAS NO ELEVADOR: " + usuario.getQuantPessoas() + "\n");
				
				break;
			case 3:
				
				System.out.println("VOCE ESCOLHEU SUBIR!!! \n");
				usuario.subir();
				System.out.println("SEU ANDAR ATUAL É: " + usuario.getAndarAtual());
				
				break;
			case 4:
				
				System.out.println("VOCE ESCOLHEU DESCER!!! \n");
				usuario.descer();
				System.out.println("SEU ANDAR ATUAL É: " + usuario.getAndarAtual());
				
				break;
			}
		}while(opc != 0);
	}
}
