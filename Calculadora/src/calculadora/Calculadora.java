/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package calculadora;

/**
 *
 * @author samuel
 */

import static calculadora.Operar.Operar;
import static calculadora.PostFijo.PostFijo;
import static calculadora.Revisar.Cadena;
import java.util.Scanner;

public class Calculadora {
    private String oper;
    
    /**
     * 
     * <ul>
     * <li>
     * Los parámetros son:
     * </li>
     * </ul>
     */
    
    public Calculadora(){
        boolean resp;
        
    }
    public String Calcular(String oper){
        String resultado = oper;
        double valorFinal;
        String [] arregloResult = null;
        String [] valorPost = null;
        Revisar revisar = new Revisar();
        boolean resp= revisar.Parentesis(oper);
        if(!resp)
            resultado = "no están bien los paréntesis";
        try{
            arregloResult=revisar.Arreglo(resultado);
            try{
                arregloResult = PostFijo(arregloResult);
                
                try{
                    valorFinal = Operar(arregloResult);
                    resultado = String.valueOf(valorFinal);
                }
                catch(Exception e){
                    System.out.println("No funcionó la operación");
                }
            }catch(Exception e){
                System.out.println("No funcionó la conversión a postfijo");
            }
        }catch(Exception e){
            System.out.println("No funcionó la conversión a arreglo de strings");
        }
       
        return String.valueOf(resultado);
        
    }
    
    
    public static void main(String[] args) {
        String operacion;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su operación: ");
        operacion = teclado.nextLine();
        System.out.println("Su operación fue: " + operacion);
        Calculadora calc = new Calculadora();
        String resultado = calc.Calcular(operacion);
        System.out.println(resultado);
        
    }
    
    
    
}
