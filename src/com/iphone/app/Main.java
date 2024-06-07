package com.iphone.app;

import java.util.Locale;
import java.util.Scanner;

import com.iphone.model.Iphone;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner terminal = new Scanner(System.in);
	System.out.println("Ligando Iphone Demo 2007...");
	
	Iphone iphoneDemo = new Iphone();
	
	System.out.println("adicionando músicas à playlist do Iphone: (até usuário apertar OK)");
	String opcao = "";
	while(!opcao.equals("OK")) {
		opcao = terminal.nextLine();
		if(!opcao.equals("OK"))
			iphoneDemo.adicionarMusicas(opcao);
	}
	
	System.out.println("adicionando números à Lista Telefônica do Iphone: (até usuário apertar OK)");
	opcao = "";
	while(!opcao.equals("OK")) {
		opcao = terminal.nextLine();
		if(!opcao.equals("OK"))
			iphoneDemo.adicionarNumeros(opcao);
	}
	
	System.out.println("Vamos demonstrar o reprodutor musical");
	System.out.println("escolha uma música para tocar");
	opcao = terminal.nextLine();
	iphoneDemo.selecionarMusica(opcao);
	iphoneDemo.pausar();
	
	System.out.println("Vamos demonstrar o aparelho telefônico");
	System.out.println("escolha um numero para ligar");
	opcao = terminal.nextLine();
	iphoneDemo.ligar(opcao);
	System.out.println("Opa! Estou recebendo uma chamada");
	iphoneDemo.atender();
	iphoneDemo.iniciarCorreioVoz();
	
	System.out.println("Por fim, vamos demonstrar o Navegador de Internet");
	System.out.println("escolha um site:");
	opcao = terminal.nextLine();
	iphoneDemo.exibirPagina(opcao);
	iphoneDemo.adicionarNovaAba();
	iphoneDemo.atualizarPagina();
	
	System.out.println("Fim da Apresentação!");
	
	terminal.close();
	}

}