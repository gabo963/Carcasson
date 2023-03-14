package Mundo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Carcasson {
	
	public final static int CANTIDADFICHAS = 72;
	public final static int DECKSIZE = 4;
	public final static String[] posibilities = {"M", "R", "C"};
	
	private int filas;

	private int columnas;
	
	private Ficha[] pool;
	
	private Ficha[] deck;

	private Ficha fichas[][];
	
	public Carcasson( int pFilas, int pColumnas )
	{
		filas = pFilas;
		columnas = pColumnas;
		
		fichas = new Ficha[filas][columnas];
		pool = new Ficha[CANTIDADFICHAS];
		deck = new Ficha[DECKSIZE];	
	}
	
	public Properties cargarPropiedades( File pArchivo ) throws Exception
    {
        Properties propiedades = new Properties();
        FileInputStream traductor = new FileInputStream( pArchivo );

        try
        {
            propiedades.load( traductor );
            traductor.close( );
        }
        catch( Exception e )
        {
            throw new Exception("El archivo no pudo ser leido.");
        }
        return propiedades;
    }
	
	public void inicializarPool( Properties pProperties )
    {
		int filas, columnas;
		
		filas = Integer.parseInt(pProperties.getProperty("filas"));
		columnas = Integer.parseInt(pProperties.getProperty("filas"));
		
    }

}
