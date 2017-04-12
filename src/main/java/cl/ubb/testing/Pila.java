package cl.ubb.testing;
public class Pila {
	private int [] pila;
	private int tope;
	public Pila(){
	pila=new int[5];
	tope=0;
}
public int TamañoPila(){
return tope;
} 
public void add(int num){
	pila[tope]=num;
	tope++;
	}
public boolean StackEmpty(int num){
	if(num==0){
		return true;
	}
	return false;
}
}
