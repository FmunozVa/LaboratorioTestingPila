package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void StackIsEmpty() {
		Pila pila=new Pila();
		int result=pila.Tamaño();
		assertEquals(0,result);
				
	}
	@Test
	public void AddThreeStackIsNotEmpty() {
		Pila pila=new Pila();
		pila.add(3);
		int result= pila.Tamaño();
		assertEquals(1,result);
				
	}
	
	
}
