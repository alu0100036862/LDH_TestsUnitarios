package tests;

import static org.junit.Assert.*;

import objetos.Grafo;
import operaciones.Disjktra;

import org.junit.Test;

public class Test02 {

	int pesoTest;
	Grafo grafo = new Grafo();
	Disjktra obj = new Disjktra(grafo);
	
	@Test
	public void test() {

		boolean salida = false;

		int i = 0;
		do {   
			
			pesoTest = obj.getAux().get(i).getPeso();
			
			if ( pesoTest < 0)
				salida = true;
			
            i += 1;
            
		} while (salida == false || i<= obj.getAux().size());  
		
		assertTrue(salida == true);
		
	}

}
