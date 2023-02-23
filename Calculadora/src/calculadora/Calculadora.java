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

/**
 *
 * @author samuel
 */
public class Calculadora {
    private String oper;
   
    /**
     *
     */
    public Calculadora(){
        boolean resp;
        
    }
    /** 
     * Calcular es la clase principal de la calculadora
     * @param oper es una cadena con la operación que se quiere calcular
     * @return <ul> 
     *          <li>double: El resultado de la operación</li> 
     *          </ul> 
     */ 
    public String Calcular(String oper){
        String resultado = oper;
        double valorFinal;
        boolean resp;
        String [] arregloResult = null;
        String [] valorPost = null;
        Revisar revisar = new Revisar();
        try{
            resp= revisar.Parentesis(oper);
            resp= revisar.Validar(oper);
            if(resp)
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
                            resultado ="Se hizo una operación no definida";
                        }
                    }catch(Exception e){
                        System.out.println("No funcionó la conversión a postfijo");
                        resultado ="No se convirtió bien a postfijo";
                        
                    }
                }catch(Exception e){
                    System.out.println("No funcionó la conversión a arreglo de strings");
                    resultado ="Hay un error de sintaxis";
                }
            else
                resultado="No están bien las entradas";
        }catch(Exception e){
            System.out.println("Ingrese carácteres válidos");
        }
       
        return String.valueOf(resultado);   
    }
    
    /**
     *
     * @param args
     */
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
