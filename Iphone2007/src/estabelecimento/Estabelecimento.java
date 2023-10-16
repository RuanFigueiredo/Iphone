package estabelecimento;

import equipamento2007.Iphone;
import funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;

public class Estabelecimento {
	public static void main(String[] args) {
		Iphone Iphone1 = new Iphone();
		
		AparelhoTelefonico aparelhoTelefonico = Iphone1;
		NavegadorInternet navegadorInternet = Iphone1;
		ReprodutorMusical reprodutorMusical = Iphone1;
		
	
		aparelhoTelefonico.atender();
		navegadorInternet.atualizarPagina();
		reprodutorMusical.selecionarMusica();
		
		
	}
}
