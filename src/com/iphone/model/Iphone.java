package com.iphone.model;

import java.util.ArrayList;
import java.util.List;

import com.iphone.util.AparelhoTelefonico;
import com.iphone.util.NavegadorInternet;
import com.iphone.util.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
private List<String> musicas;
private List<String> numeros;
private String musicaSelecionada;

public Iphone() {
	this.musicas = new ArrayList<>();
	this.numeros = new ArrayList<>();
}
public List<String> getMusicas() {
	return musicas;
}

public List<String> getNumeros() {
	return numeros;
}

public void adicionarMusicas(String musica){
	musicas.add(musica);
}

public void adicionarNumerosTelefonicos(String numero){
	numeros.add(numero);
}

// Implementação dos métodos da interface ReprodutorMusical
@Override
public void tocar() {
	System.out.println("tocando: " + musicaSelecionada);
	
}
@Override
public void pausar() {
	System.out.println("música pausada");
	
}
@Override
public void selecionarMusica(String musica) {
		if(musicas.contains(musica)){
			musicaSelecionada = musica;
			tocar();
		} else {
			System.out.println("musica escolhida não está na playlist");
		}
	}

//
@Override
public void ligar(String numero) {
	System.out.println("Ligando para: " + numero);
	
}
@Override
public void atender() {
	System.out.println("Telefone tocando... turutu tututu turutu");
	System.out.println("Atendendo!");
}
@Override
public void iniciarCorreioVoz() {
	System.out.println("Iniciando correio de voz");
	
}



@Override
public void exibirPagina(String url) {
	System.out.println("exibindo página da url:" + url);
	
}
@Override
public void adicionarNovaAba() {
	System.out.println("nova aba adicionada");

}
@Override
public void atualizarPagina() {
	System.out.println("atualizando página...");

	
}



}
