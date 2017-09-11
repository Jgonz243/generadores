package generadores;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhon Gonzales
 */
public class Funciones_Midsquare {
    
 int iter;
    int semilla;
    public Funciones_Midsquare(){
        this.iter=iter;
        this.semilla=semilla;
    }
        
    public int generador(int iter, int semilla){
    int cont=0;
    List<Double> aleatorio =new ArrayList<>();
    List<Integer> X =new ArrayList<>();

    while (cont!=iter){
       cont++;
   
       int potencia=(int) Math.pow(semilla,2);
       String aux=potencia+"";
       
            if(aux.length()%2!=0){
                aux="0"+aux;
            }
        int numeros=aux.length()/2;
        int descarte=numeros/2;

        semilla=Integer.parseInt(aux.substring(descarte,numeros+2));
         System.out.println("0."+semilla);
         return semilla;
}
       return 0;
    }

   
 }