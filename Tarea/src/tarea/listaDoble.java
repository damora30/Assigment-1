/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import javax.swing.JOptionPane;

/**
 *
 * @author Genier Daniel Mora
 */
public class listaDoble {
    
    protected nodoDoble inicio, fin ; 
    
    public listaDoble (){

    inicio = null;
    fin = null ;
}
    
    public boolean vacia ()
    {
        return inicio == null;
    }
    
    public void agregarAlfinal(int el)
    {
        if(!vacia())
        {
            fin = new nodoDoble(el,null ,fin);
            fin.anterior.siguiente = fin;
            
        }
        else
        {
            inicio = fin = new nodoDoble(el);
        }
        
    }
    
    public void mostrarlista(){
    
    nodoDoble recorrer = inicio;
    System.out.println();
        while (recorrer!= null) 
         {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
         }
   }
    
    
    public void unirlistas(listaDoble list1 , listaDoble list2, listaDoble list3,
            listaDoble nueva)
    {
    
        nodoDoble aux1 = list1.inicio;
        nodoDoble aux2 = list2.inicio;
        nodoDoble aux3 = list3.inicio;
        
        nueva.agregarAlfinal(aux1.dato);
        nueva.agregarAlfinal(aux2.dato);
        nueva.agregarAlfinal(aux3.dato);
        
        while(aux1.siguiente != null)
        {
            aux1 = aux1.siguiente;
            aux2 = aux2.siguiente;
            aux3 =aux3.siguiente;
            
            nueva.agregarAlfinal(aux1.dato);
            nueva.agregarAlfinal(aux2.dato);
            nueva.agregarAlfinal(aux3.dato);
        }
    
           
    }
    
    public void buscarreptido(int valor)
    {
        nodoDoble aux = inicio;
        int contador=1;
        while(aux.siguiente!=null)
        {
            if(aux.dato == valor)
            {
                contador++;
            }
            aux= aux.siguiente;
        }
        
        JOptionPane.showMessageDialog(null,"el valor existe"+" " + contador +" "+ "veces");
        
    }
    
    public void tamanolista()
    {
        nodoDoble aux = inicio;
        int contador=1;
        while(aux.siguiente != null)
        {
            aux = aux.siguiente;
            contador++;
        }
        JOptionPane.showMessageDialog(null,"La Lista tiene " +" " + contador + ""+ "nodos" );
                
    }
    
}
