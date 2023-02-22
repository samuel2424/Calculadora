/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author samuel
 */

public class PostFijo {

    
    private static int priority (String dato){
        int resultado = 0; // En caso de que el dato sea un paréntesis izquierdo
        
        switch (dato){
            case "+":
            case "-": resultado = 1;
                break;
            case "*":
            case "/": resultado = 2;
        }
        return resultado;
    }
    /** 
     * PostFijo convierte un arreglo de cadenas en un arreglo de cadenas con notación postfija
     * @param cadena[] es un arreglo de strings con la notación normañ
     * @return <ul> 
     *          <li>String[] devuelve un arreglo de datos tipo String con los elementos en notación postfija</li> 
     *          </ul> 
     */ 
    public static String[] PostFijo(String cadena[] ){
        String  post[] = new String[cadena.length];
        
        int k=0;
        int i=0;
        PilaA <String> pila = new PilaA(cadena.length);
        while(i<cadena.length){
            if(cadena[i].equals("(")){
                pila.push(cadena[i]);
            }
            else{
                if(cadena[i].equals( ")")){
                     while( !pila.peek().equals("(")){
                         post[k] =pila.pop();
                         k++;
                     }
                     pila.pop();
                }
                else{
                    if ( !cadena[i].equals("+") && !cadena[i].equals("-") && !cadena[i].equals("*") && !cadena[i].equals("/") ){
                        post[k] = cadena[i];
                        k++;
                    }
                    else {  
                        while (!pila.isEmpty() && priority(pila.peek()) > priority(cadena[i])){
                            post[k] = pila.pop();
                            k++;
                        }
                        pila.push(cadena[i]);
                    }
                }
                    
            }
            i++;
       }
        while (!pila.isEmpty()){
            post[k] = pila.pop();
            k++;
        }
        return post;
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String m = "2+432+31";
     
        Revisar revis = new Revisar();
        String [] cad = (String [])revis.Arreglo(m);
        
       
        String[] a = PostFijo(cad);
        for(int i =0; i<a.length; i++)
            System.out.println(a[i]);
      
    }
}
