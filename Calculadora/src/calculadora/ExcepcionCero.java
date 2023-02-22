package calculadora;

/**
 *
 * @author samuel
 */
public class ExcepcionCero extends RuntimeException{    

    /**
     *
     */
    public ExcepcionCero( ){        
        super("Se dividió entre cero ");    
    }   

    /**
     *
     * @param mensaje
     */
    public ExcepcionCero(String mensaje){        
        super(mensaje);    
    }
}
