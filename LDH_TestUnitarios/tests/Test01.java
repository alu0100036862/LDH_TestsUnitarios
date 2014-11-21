package tests;

import static org.junit.Assert.*;
import operaciones.ListaNodo;

import org.junit.Test;

public class Test01 {

	@Test
	public void test01() {
		ListaNodo Lista = new ListaNodo();
		boolean resultado = Lista.isEmpty();
		assertTrue(resultado == true);
	}	
}
