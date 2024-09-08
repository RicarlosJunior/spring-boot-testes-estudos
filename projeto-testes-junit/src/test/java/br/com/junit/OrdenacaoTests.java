package br.com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdenacaoTests {

	
	//@Order(1)
	@DisplayName("C")
	@Test
	void deveTestarFluxoA() {
		Assertions.assertTrue(true); //Para estudos
	}
	
	//@Order(2)
	@DisplayName("A")
	@Test
	void deveTestarFluxoB() {
		Assertions.assertTrue(true); //Para estudos
	}
	
	//@Order(3)
	@DisplayName("B")
	@Test
	void deveTestarFluxoC() {
		Assertions.assertTrue(true); //Para estudos
	}
}
