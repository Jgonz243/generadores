/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author jhon Gonzales
 */
public class Funcion_Generador_Lineal {
    
float semilla,m;
int a,b,iteraciones;
       public float u;
    
    Funcion_Generador_Lineal(float semilla,int a,int b,float m,int iteraciones){
        this.semilla=semilla;
        this.a=a;
        this.b=b;
        this.m=m;
        this.iteraciones=iteraciones;
        
       
      }
    public float evaluar(float semilla,int a,int b,float m,int iteraciones){
  
        int contador=0;
        while(contador<=iteraciones){
            contador++;
            float funcion = 0;            
            funcion=a*semilla+1;
            float funcion2=funcion%m;
            semilla=funcion2;            
                  float u=0;
            u=semilla/m;
             System.out.println("X= "+ semilla);
             System.out.println("U="+ u);
            return semilla;

        }
        return 0;
    }
        public float evaluar2(float semilla,int a,int b,float m,int iteraciones){
  
        int contador=0;
        while(contador<=iteraciones){
            contador++;
            float funcion = 0;            
            funcion=a*semilla+1;
            float funcion2=funcion%m;
            semilla=funcion2;            
                  float u=0;
            u=semilla/m;
             System.out.println("X= "+ semilla);
             System.out.println("U="+ u);
            return u;

        }
        return 0;
    }
    
   
      
     
    }
        
      