package br.ifpe;

import org.junit.Test;

import junit.framework.Assert;

public class AplicacaoTest {
	@Test
	public void teste1() {
		//cen�rio
		Aplicacao app= new Aplicacao();
		
		//A��o
		String valor = app.acao();
		
		//Verifica��o
		
		org.junit.Assert.assertTrue(valor == "EXEMPLO");		
		
	}

}
