package br.com.junit;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PessoaTests {

	@Test
	void deveTestarIdade() {
		Pessoa cecilia = new Pessoa("Cecília", LocalDate.of(2023, 3, 16));
		assertEquals(2, cecilia.getIdade());
	}
	
	
	@Test
	void deveTestarMaiorDeIdade() {
		Pessoa cecilia = new Pessoa("Cecília", LocalDate.of(2023, 3, 16));
		assertFalse(cecilia.maiorDeIdade());
	}
}

