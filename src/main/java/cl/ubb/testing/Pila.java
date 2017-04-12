package cl.ubb.testing;
public class Pila {
	private int [] pila;
	private int tope;
	public Pila(){
	pila=new int[5];
	tope=0;
}
public int Tamaño(){
return tope;
} 
public void add(int num){
	pila[tope]=num;
	tope++;
	
	
}
}
