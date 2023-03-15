package Interfaz;

import java.awt.*;

import javax.swing.*;

import Mundo.Carcasson;

public class InterfazCarcasson extends JFrame {

	// -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante que representa el serial version para la serialización.
     */
	private static final long serialVersionUID = -1218088545589042976L;

	// -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	/**
     * Clase principal del mundo.
     */
    private Carcasson mundo;
	
    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

//    /**
//     * Panel con las extensiones.
//     */
//    private PanelOpciones panelOpciones;
//
//    /**
//     * Panel con la imagen del encabezado.
//     */
//    private PanelImagen panelImagen;
//
//    /**
//     * Panel que contiene el tablero.
//     */
//    private PanelTablero panelTablero;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la clase principal del mundo y los paneles de la interfaz. <br>
     * <b>post: </b> Se creó la interfaz con todos los paneles y la referencia al mundo.
     */
    public InterfazCarcasson( )
    {
        mundo = new Carcasson( );

        // Construye la forma.
        setLayout( new BorderLayout( ) );
        setSize( 820, 700 );
        setTitle( "Carcasson" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );

        // Creación de los paneles.
//        panelImagen = new PanelImagen( );
//        add( panelImagen, BorderLayout.NORTH );
//
//        panelOpciones = new PanelOpciones( this );
//        add( panelOpciones, BorderLayout.SOUTH );
//
//        JPanel auxPanelInformacion = new JPanel( );
//        auxPanelInformacion.setLayout( new GridLayout( 1, 3 ) );
//
//        panelTablero = new PanelTablero( this );
//        auxPanelInformacion.add( panelTablero );
//
//        add( auxPanelInformacion, BorderLayout.CENTER );

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    
    
    
    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------
    
	public static void main(String[] args) {
		try
        {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
        InterfazCarcasson interfaz = new InterfazCarcasson( );
        interfaz.setVisible( true );

	}

}
