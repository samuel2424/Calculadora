/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author samuel
 */
public class Revisar {
    
    public Revisar(){
        
    }
    
    public boolean Parentesis(String cadena){
        PilaA pila = new PilaA();
        boolean resp = true;
        char a = '(';
        char b = ')';
        int i=0;
        while(i<cadena.length() && resp){
            if( a == cadena.charAt(i)){
                pila.push(a);
                System.out.print("\n Hay un (");
            }
            if( b == cadena.charAt(i)){
               
                if(pila.isEmpty())
                    resp = false;
                else{
                    pila.pop(); 
                    System.out.print("\n Hay un )");
                }
                
            }
            if(pila.isEmpty())
                    resp = false;
            i++;
        }
        if(pila.isEmpty() && resp)
            resp = true;
                 
        return resp; 
    }
           
}
