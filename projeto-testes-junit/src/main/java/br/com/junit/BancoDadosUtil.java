package br.com.junit;

import java.util.logging.Logger;

public class BancoDadosUtil {

	private static final Logger LOGGER = Logger.getLogger(BancoDadosUtil.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou conexao");
	}
	
	
	public static void finalizarConexao() {
		LOGGER.info("Finalizou conexao");
	}
	
	
	public static void gravarLogAntesDoTeste() {
		LOGGER.info("Gravou log antes do teste");
	}
	
	public static void gravarLogDepoisDoTeste() {
		LOGGER.info("Gravou log despois do teste");
	}
}


