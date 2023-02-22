/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import static calculadora.PostFijo.PostFijo;
import static calculadora.Revisar.Arreglo;

/**
 *
 * @author samuel
 */
public class Operar {
    
    /** 
     * Operar suma los elementos 
     * @param cadena es un arreglo de strings con la notación postfija
     * @return <ul> 
     *          <li>double: El resultado de la operación</li> 
     *          </ul> 
     */ 
    public static double Operar(String cadena[] ){
        PilaADT <Double> pila = new PilaA();
        double operador1=0.0;
        double operador2=0.0;
        double resultado =0;
        int i=0;       
        while(i<cadena.length && cadena[i] !=null){
            if( !cadena[i].equals("+") && !cadena[i].equals("-") && !cadena[i].equals("*") && !cadena[i].equals("/")){
                pila.push(Double.valueOf(cadena[i]));
                System.out.println(cadena[i]);
            }
            else{
                operador2 = pila.pop();
                operador1 = pila.pop();
                
                switch (cadena[i]){
                    case "+":resultado = operador1 + operador2;
                        break;
                    case "-": resultado = operador1 - operador2;
                        break;
                    case "*":resultado = operador1 * operador2;
                        break;
                    case "/": if (operador2 != 0)
                             resultado = operador1 / operador2;
                    else
                        throw new ExcepcionCero("Se dividió entre cero");
                             
                }
                pila.push(resultado);
            }
            i++;
        }
        return pila.pop();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String [] cadena=Arreglo("4+2");
        String [] cad = PostFijo(cadena);
        for(int i =0;i<cad.length;i++)
            System.out.println(cad[i]);
        System.out.println(Operar(cad));
        
    }
}
