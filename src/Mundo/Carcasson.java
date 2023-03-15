package Mundo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Carcasson {
	
	public final static String[] posibilities = {"M", "R", "C", "W"};
	
	private int filas;

	private int columnas;
	
	private Ficha[] pool;
	
	private Ficha[] deck;

	private Ficha fichas[][];
	
	private int cantidadPool;
	
	private int deckSize;
	
	public Carcasson( ) {
		
	}
	
	public Properties cargarPropiedades( File pArchivo ) throws Exception {
        Properties propiedades = new Properties();
        FileInputStream traductor = new FileInputStream( pArchivo );

        try {
            propiedades.load( traductor );
            traductor.close( );
        }
        catch( Exception e ) {
            throw new Exception("El archivo no pudo ser leido.");
        }
        return propiedades;
    }
	
	public void inicializarPoolDeck( Properties pProperties ) {
		
		filas = Integer.parseInt(pProperties.getProperty("filas"));
		columnas = Integer.parseInt(pProperties.getProperty("columnas"));
		cantidadPool = Integer.parseInt(pProperties.getProperty("cantidad"));
		deckSize = Integer.parseInt(pProperties.getProperty("cantidadDeck"));
		
		fichas = new Ficha[filas][columnas];
		pool = new Ficha[cantidadPool];
		deck = new Ficha[deckSize];
		
		for( int i = 0; i < pool.length; i++ ) {
			pool[i] = new Ficha(pProperties.getProperty("ficha"+i).split(","));
		}
    }
	
	public Ficha[] getDeck() {
		return deck;
	}
	
	public Ficha[][] darTablero() {
		return fichas;
	}
	
	public Ficha aleatoria( Ficha[] pPool ) {
		Ficha aleatoria = null;
		
		
		
		return aleatoria;
	}
}
