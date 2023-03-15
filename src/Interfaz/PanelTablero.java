package Interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Mundo.Carcasson;
import Mundo.Ficha;

public class PanelTablero extends JPanel implements ActionListener {

	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
	
	/**
	 * Constante que representa el serial version para la serialización.
	 */
	private static final long serialVersionUID = -7800246262408239896L;
	
	public final static String RUTA_IMAGEN_MAPA = "./data/map/";
	public final static String EXTENSION_IMAGEN = ".png";

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación
     */
    private InterfazCarcasson principal;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Matriz que muestra el tablero de juego usando botones.
     */
    private JButton [][]tablero;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel con la ventana dada por parámetro.<br>
     * <b> post : </b> Se creo el panel con la ventana principal dada por parámetro.
     * @param pVentana Ventana principal. pVentana != null.
     */
    public PanelTablero( InterfazCarcasson pVentana ) {
        principal = pVentana;      
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    
    public void inicializar( Carcasson pCarcasson ) {
    	
    	Ficha[][] fichasTablero = pCarcasson.darTablero();
    	
    	removeAll();
    	tablero = new JButton[fichasTablero.length][fichasTablero[0].length];
    	setLayout(  new GridLayout( tablero.length, tablero[0].length ) );
    	
    	for( int i = 0; i < fichasTablero.length; i++ ) {
    		for( int j = 0; j < fichasTablero[0].length; j++ ) {
    			
    			Ficha ficha = fichasTablero[i][j];
    			
    			//TODO: Completar la inicializacion del tablero.
    			
    		}
    	}
    	
    }
    
	public void actionPerformed(ActionEvent pEvento) {
		String posicion = pEvento.getActionCommand();
		
	}

}
