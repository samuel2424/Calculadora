/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author samuel
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    
    public static void imprime(double [] a, int longitud ){
        if(longitud >0){
            System.out.println(a[longitud-1]);
            imprime(a,longitud-1);
        }
    }
     public static void imprime(double [] a, int longitud , int k){
        if(k<longitud){
            System.out.println(a[k]);
            imprime(a,longitud,k+1);
        }
    }    
    public static void main(String[] args) {
        // TODO code application logic here
        double arre[] = {1,2,8};
        imprime(arre,3,0);        
        imprime(arre,3);         

    }
    
}
