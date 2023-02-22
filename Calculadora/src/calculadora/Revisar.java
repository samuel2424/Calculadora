/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculadora;
import java.util.ArrayList; 

/**
 *
 * @author samuel
 */
public class Revisar {
    
    /**
     *
     */
    public Revisar(){
        
    }
    
    /**
     *
     * @param cadena
     * @return
     */
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
            else{
                if( b == cadena.charAt(i)){
                    if(pila.isEmpty())
                        resp = false;
                    else{
                        pila.pop(); 
                        System.out.print("\n Hay un )");
                    }
                }
            }
            i++;

        }
        if(pila.isEmpty() && i==cadena.length())
            resp = true;
        else{
            resp = false;
        }        
        
        
        return resp; 
    }
    
    /**
     *
     * @param cadena
     * @return
     */
    public boolean Validar(String cadena){
        char op = '0';
        boolean resp = true;
        int i=0;
        while(i<cadena.length() && resp){
             if(cadena.charAt(i)>= '0' &&  cadena.charAt(i) <='9'){
                 op = '0';
             }
             else{
                if(cadena.charAt(i)== '+' ||  cadena.charAt(i) =='*' || cadena.charAt(i)== '/' || cadena.charAt(i)== '-'){
                    
                    if(op =='0')
                        op = cadena.charAt(i);
                    else
                        resp = false;
                }
                
                else{
                    if(!(cadena.charAt(i)== '(') && !(cadena.charAt(i)== ')') )
                        resp = false;
                }
                 
             }
                 
             i++;
        }
        return resp;     
    }
    
    /**
     *
     * @param cadena toma una cadena de datos que se quieren calcular
     * @return 
     * <ul>
     *  <li>String[] una cadena de strings </li>
     * </ul>
     */
    public static String [] Arreglo(String cadena){
        ArrayList <String> arreglo = new ArrayList<String>();
        String [] ArregloFinal;
        int k=0;
        int i=0;
        String a = "";
        while(i<cadena.length()){
            if(cadena.charAt(i)>= '0' &&  cadena.charAt(i) <='9'){
                    
                    while(i<cadena.length() && cadena.charAt(i)>= '0' &&  cadena.charAt(i) <='9' ){
                        a=a+String.valueOf(cadena.charAt(i));
                        i++;
                    } 
                    arreglo.add(a); 
                    a="";

             }
            else{
                a= String.valueOf(cadena.charAt(i));
                arreglo.add(a);
                a="";
                i++;
            }
          
        }
        ArregloFinal = new String[arreglo.size()];
        for(int j = 0; j<arreglo.size(); j++)
            ArregloFinal[j]=String.valueOf(arreglo.get(j));
        return ArregloFinal;
    }
    
    /**
     *
     * @param arreglo convierte un arreglo a cadena
     * @return
     */
    public static String Cadena(String [] arreglo){
         String cad = "";
         for(int i =0; i<arreglo.length; i++)
             cad = cad+arreglo[i];
         return cad;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String [] cad = Arreglo("2+2");
        for(int i =0; i<cad.length; i++){
            System.out.println(cad[i]);
        }
         
    }
           
}
