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
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        listaDoble list = new listaDoble();
        listaDoble list1 = new listaDoble();
        listaDoble list2 = new listaDoble();
        listaDoble list3 = new listaDoble();
        listaDoble merge = new listaDoble();
        
        int opcion = 0 , elemen;
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Agregar un nodo a Lista 1 \n"
             + "2. Agregar un nodo a Lista 2 \n"
             + "3. Agregar un nodo a lista 3  \n"   
             + "4. Unir Lista 1, lista 2 y lista 3 \n" 
             + "5. Obtener el tamano de la lista 1 \n"   
             + "6. cuantas veces se repite un valor en la lista 1 \n" 
             + "7. informacion del estudiante \n"       
             + "8. Salir", " Menu de Opciones",3));
            
            switch(opcion)
            {
                case 1:
                    elemen = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor","",3));
                    list1.agregarAlfinal(elemen);
                    
                break;
                
                case 2:
                    elemen = Integer.parseInt(JOptionPane.showInputDialog(null,"Igrese el valor","",3));
                    list2.agregarAlfinal(elemen);
                    
                break;
                
                
                case 3:
                    elemen = Integer.parseInt(JOptionPane.showInputDialog(null,"Igrese el valor","",3));
                    list3.agregarAlfinal(elemen);
                    
                break;
                
                case 4:
                    merge.unirlistas(list1, list2, list3, merge);
                    JOptionPane.showMessageDialog(null,"Lista 1" );
                    list1.mostrarlista();
                    JOptionPane.showMessageDialog(null,"Lista 2" );
                    list2.mostrarlista();
                    JOptionPane.showMessageDialog(null,"Lista 3" );
                    list3.mostrarlista();
                    JOptionPane.showMessageDialog(null,"Lista final" );
                    merge.mostrarlista();
                    
                break;
                    
                case 5:
                    elemen = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Selecciona la lista a analizar \n"+"1-- Lista 1 \n"
                                    +"2-- Lista 2\n" +"3-- Lista 3","",3));
                    if(elemen == 1)
                    {
                        list1.tamanolista();
                        list1.mostrarlista();
                    }
                    if(elemen ==2)
                    {
                        list2.tamanolista();
                        list2.mostrarlista();
                    }
                    if(elemen ==3)
                    {
                        list3.tamanolista();
                        list3.mostrarlista();
                    }
                    
                break;
                
                case 6:
                    
                    elemen = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Selecciona la lista a analizar \n"+"1-- Lista 1 \n"
                                    +"2-- Lista 2\n" +"3-- Lista 3","",3));
                    if(elemen == 1)
                    {
                        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el valor a buscar"));
                        list1.buscarreptido(buscar);
                        list1.mostrarlista();
                    }
                    if(elemen ==2)
                    {
                        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el valor a buscar"));
                        list2.buscarreptido(buscar);
                        list2.mostrarlista();
                    }
                    if(elemen ==3)
                    {
                        int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca el valor a buscar"));
                        list3.buscarreptido(buscar);
                        list3.mostrarlista();
                    }
                    
                    
                    
                break;
                   
                case 7:
                    
                    JOptionPane.showMessageDialog(null,"Genier Daniel Mora Arias \n"
                            + "");
                    
                break;
                
                case 8:
                    
                    System.exit(0);
                    
                break;
                    
                    
                
                
            }
        
        }
        while(opcion!=12);
    }
    
}
