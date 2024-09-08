package br.com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoDadosUtilTests {

	@BeforeAll
	static void deveTestarInicializacaoDeConexao() {
		BancoDadosUtil.iniciarConexao();
	}
	
	
	@BeforeEach
    void deveTestarGravarLogAntesDoTeste() {
		BancoDadosUtil.gravarLogAntesDoTeste();
	}
	
	@Test
	void deveTestarSql1() {
		Assertions.assertTrue(true); //So para estudos
		System.out.println("Teste 1");
	}
	
	@Test
	void deveTestarSql2() {
		Assertions.assertTrue(true); //So para estudos
		System.out.println("Teste 2");
	}
	
	
	@AfterEach
	void deveTestarGravarLogDepoisDoTeste() {
		BancoDadosUtil.gravarLogDepoisDoTeste();
	}
	
	
	@AfterAll
	static void deveTestarFinalizacaoDeConexao() {
		BancoDadosUtil.finalizarConexao();
	}
	
}
