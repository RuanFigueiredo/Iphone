package equipamento2007;

import funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	public void pausar() {
		System.out.println("pausando música via aparelho Iphone");
		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música via aparelho Iphone");
		
	}

	public void tocar() {
		System.out.println("Tocando música via  aparelho Iphone");	
	}

	public void exibirPagina() {
		System.out.println("exibindo página de internet via aparelho Iphone");
		
	}

	public void atualizarPagina() {
		System.out.println("atualizando página web via aparelho Iphone");
		
	}

	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba via aparelho Iphone");
		
	}

	public void ligar() {
		System.out.println("realizando ligação via aparelho Iphone");
	}

	public void atender() {
		System.out.println("atendendo telefone via aparelho Iphone");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz via aparelho Iphone");
		
	}
	
}
