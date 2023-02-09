/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author samuel
 */
public class ExcepciónColecciónVacía extends RuntimeException{    
    public ExcepciónColecciónVacía( ){        
        super("Colección vacía");    
    }   
    public ExcepciónColecciónVacía(String mensaje){        
        super(mensaje);    
    }
}