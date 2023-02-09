/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author samuel
 */
public interface PilaADT<T>{
    public T pop( ); // Debe quitar el elemento que está en el tope y regresarlo.
    public void push(T dato); // Agrega el dato en el tope de la pila.
    public T peek( ); 
    public boolean isEmpty( ); // Regresa true si la pila no tiene elementos.
}
