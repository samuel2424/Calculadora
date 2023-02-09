/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package calculadora;

/**
 *
 * @author samuel
 */

import java.util.Scanner;

public class Calculadora {
    private String oper;
    
    /**
     * @param args the command line arguments
     */
    
    public Calculadora(){
        boolean resp;
        
    }
    public String Calcular(String oper){
        String resultado = oper;
        Revisar revisar = new Revisar();
        boolean resp= revisar.Parentesis(oper);
        if(!resp)
            resultado = "no están bien los paréntesis";
        
        return resultado;
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
