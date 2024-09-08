package br.com.junit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTests {

	
	@Test
	void deveTestarExceptionNomeNaoPreechido() {
		Pessoa pessoa = new Pessoa("", LocalDate.now());
		Assertions.assertThrows(IllegalArgumentException.class, () -> pessoa.nomePreechido());
	}
	
	@Test
	void deveTestarExceptionNomePreechido() {
		Pessoa pessoa = new Pessoa("Ricarlos", LocalDate.now());
		Assertions.assertDoesNotThrow(() -> pessoa.nomePreechido());
	}
	
}
