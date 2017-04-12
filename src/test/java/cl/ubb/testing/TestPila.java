package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {
	Pila pila=new Pila();
	@Test
	public void IsEmpty() {
		int result=pila.Tamaño();
		assertEquals(0,result);
				
	}

}
