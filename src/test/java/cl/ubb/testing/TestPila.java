package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void IsEmpty() {
		Pila pila=new Pila();
		int result=pila.Tamaño();
		assertEquals(0,result);
				
	}
	@Test
	public void IsNotEmpty() {
		Pila pila=new Pila();
		pila.add(3);
		int result= pila.Tamaño();
		assertEquals(1,result);
				
	}
}
