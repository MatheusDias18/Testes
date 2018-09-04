package br.ifpe;

import org.junit.Test;

import junit.framework.Assert;

public class AplicacaoTest {
	@Test
	public void teste1() {
		//cenário
		Aplicacao app= new Aplicacao();
		
		//Ação
		String valor = app.acao();
		
		//Verificação
		
		org.junit.Assert.assertTrue(valor == "EXEMPLO");		
		
	}

}
