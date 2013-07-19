package mx.isystems.TestJava;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        log.info("Prueba de modificacion de clase");
        log.info("Log 2 modificacion de archivo para probar cambios");
    }
}
