package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void StackIsEmpty() {
		Pila pila=new Pila();
		int result=pila.Tama�oPila();
		assertEquals(0,result);
				
	}
	@Test
	public void AddThreeStackIsNotEmpty() {
		Pila pila=new Pila();
		pila.add(3);
		int result= pila.Tama�oPila();
		assertEquals(1,result);
				
	}
		@Test
	public void AddOneTwoStackIsNotEmpty() {
		Pila pila=new Pila();
		pila.add(1);
		pila.add(2);
		boolean result= pila.StackEmpty(pila.Tama�oPila());
		assertEquals(false,result);
	}
		public void AddFourAndFiveStackTamIsTwo() {
			Pila pila=new Pila();
			pila.add(4);
			pila.add(5);
			int result= pila.Tama�oPila();
			assertEquals(2,result);
		}
}
