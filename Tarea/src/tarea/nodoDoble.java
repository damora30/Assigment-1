/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Genier Daniel Mora
 */
public class nodoDoble {
    
    public int dato;
    nodoDoble siguiente, anterior ; // Puntero enalce 
    
   // Constructor para cuando ya hay nodos
   
    public nodoDoble(int valor, nodoDoble s, nodoDoble a) {
       dato = valor;
       siguiente = s ;
       anterior = a ;
    }
    
    // Constructor para cuando aun no hay nodos

    public nodoDoble (int valor)
{
    this(valor, null, null);
    
}
    
}
