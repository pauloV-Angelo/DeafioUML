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


// construtor
public Iphone() {
	this.musicas = new ArrayList<>();
	this.numeros = new ArrayList<>();
}


// getters para os atributos (não precisam de setters)
public List<String> getMusicas() {
	return musicas;
}

public List<String> getNumeros() {
	return numeros;
}

public String getMusicaSelecionada() {
	return musicaSelecionada;
}


// métodos únicos do Iphone 
public void adicionarMusicas(String musica){
	musicas.add(musica);
}

public void adicionarNumeros(String numero){
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


// Implementação dos métodos da interface AparelhoTelefonico
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


//Implementação dos métodos da interface NavegadorInternet
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
