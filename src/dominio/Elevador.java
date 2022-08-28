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

/*
			Crie a classe Elevador para armazenar as informações de um elevador
		dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0),
		total de andares no prédio (desconsiderando o térreo), capacidade do
		elevador e quantas pessoas estão presentes nele. A classe deve também
		disponibilizar os seguintes métodos:
			Inicializa: que deve receber como parâmetros a capacidade do elevador e
		o total de andares no prédio (os elevadores sempre começam no térreo e
		vazios);
			Entra: acrescenta uma pessoa no elevador (só deve acrescentar se ainda
		houver espaço);
			Sai: remove uma pessoa do elevador (só deve remover se houver alguém
		dentro dele);
			Sobe: sobe um andar (não deve subir se já estiver no último andar);
			Desce: desce um andar (não deve descer se já estiver no térreo);
	
*/