package dominio;

public class Elevador {
	
	private int andarAtual;
	private int andarTotal;
	private int capacidade;
	private int quantPessoas;
	
	public void inicializar(int capacidadeElev, int totalAndar) {
		
		this.capacidade = capacidadeElev;
		this.andarTotal = totalAndar;
		this.andarAtual = 0;
		this.quantPessoas = 0;
		
	}
	public void entrar() {
		
		if(quantPessoas != capacidade) {
			
			quantPessoas++;
			
		}else {
			
			System.out.println("ELEVADOR CHEIO!!!!");
			
		}
	}	
	public int getQuantPessoas() {
		return quantPessoas;
	}
	public void sair() {
		
		if(quantPessoas != 0) {
			
			quantPessoas--;
			
		}else {
			
			System.out.println("ELEVADOR VAZIO!!!!");
			
		}
	}
	public void subir(){
		
		if(andarAtual == andarTotal) {
			
			System.out.println("ELEVADOR NO ULTIMO ANDAR!!!!");
			
		}else {
			
			andarAtual++;
			
		}
		
	}	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void descer() {
		
		if(andarAtual == 0) {
			
			System.out.println("ELEVADOR NO PRIMEIRO ANDAR!!!!");
			
		}else {
			
			andarAtual--;
			
		}
	}	
}
