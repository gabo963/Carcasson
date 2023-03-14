package Mundo;

public class Ficha {
	
	public final static int ROTACION = 90;
	
	// Variables
	
	private String[] lados;
	private int rotacion;
	
	// Constructor
	
	public Ficha( String[] pLados )
	{
		lados = pLados;
		rotacion = 0;
	}
	
	// Metodos
	
	public void rotar() {
		switch( rotacion ) {
			case 0:
				lados = rotateArray(lados);
				rotacion++;
				break;
			case 1:
				lados = rotateArray(lados);
				rotacion++;
				break;
			case 2:
				lados = rotateArray(lados);
				rotacion++;
				break;
			case 3:
				lados = rotateArray(lados);
				rotacion = 0;
				break;
		}
	}
	
	public String[] rotateArray( String[] pArray )
	{
		String[] change = pArray;
		String temp = change[0];
		for( int i = 0; i < change.length - 1; i++ ) {
			change[i] = change[i+1];
		}
		change[change.length - 1] = temp;
		return change;
	}

}
