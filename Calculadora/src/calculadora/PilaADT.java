/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author samuel
 * @param <T>
 */
public interface PilaADT<T>{

    /**
     *
     * @return
     */
    public T pop( ); // Debe quitar el elemento que está en el tope y regresarlo.

    /**
     *
     * @param dato
     */
    public void push(T dato); // Agrega el dato en el tope de la pila.

    /**
     *
     * @return
     */
    public T peek( ); 

    /**
     *
     * @return
     */
    public boolean isEmpty( ); // Regresa true si la pila no tiene elementos.
}
