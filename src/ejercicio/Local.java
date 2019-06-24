/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author lucas
 */
public class Local 
{
    private ArrayList<Vehiculo> lista;
    private ArrayList<Vehiculo> listaMayorAMenor;
        
        public Local()
        {
            lista= new ArrayList<>();
            listaMayorAMenor=new ArrayList<>();
            
        }
        public String vehiculoMasCaro()
        {
            String nombreVehiculoMasCaro="nada";
            double PvehiculoMasCaro=0;
            
            for (int i = 0; i < lista.size(); i++) 
            {
                if (lista.get(i).getPrecio()>PvehiculoMasCaro) 
                {
                    PvehiculoMasCaro=lista.get(i).getPrecio();
                    nombreVehiculoMasCaro=lista.get(i).getMarca()+" "+ lista.get(i).getModelo();
                }
              
            }
            return nombreVehiculoMasCaro;
        }
        public String vehiculoMasBarato()
        {
            String nombreVehiculoMasBarato="nada";
            double PvehiculoMasBarato=1000000000;
            
            for (int i = 0; i < lista.size(); i++) 
            {
              if(lista.get(i).getPrecio()<PvehiculoMasBarato)
              {
                  PvehiculoMasBarato=lista.get(i).getPrecio();
                  nombreVehiculoMasBarato=lista.get(i).getMarca()+" "+lista.get(i).getModelo();
              }
              
            }
            
            return nombreVehiculoMasBarato;
        }
        public String mostrarLista()
        {
          String TodaLista="";  
            for (int i = 0; i < lista.size(); i++) 
            {
            TodaLista=TodaLista+lista.get(i).toString();
            
            }
           return TodaLista;
        }
        public void agregarLista(Vehiculo v)
        {
            lista.add(v);
        }
        
        public String VehiculoConY()
        {
            String Letra="Y";
            String VehiculoY="ninguno";
            //lista.get(0).getModelo().contains(Letra);
            for (int i = 0; i < lista.size(); i++) 
            {
                if (lista.get(i).getModelo().contains(Letra)) 
                {
                    VehiculoY= lista.get(i).getMarca()+" "+lista.get(i).getModelo()+" $"+lista.get(i).getPrecio();
                }
                             
            }
            return VehiculoY;
        }
        public String mayorAMenor()
        {
            String listaMaN="";
            for (int i = 0; i < lista.size(); i++) 
            {
                listaMayorAMenor.add(lista.get(i));
            }
            
            
            Collections.sort(listaMayorAMenor, new MayorMenor());
            
            for (int i = 0; i < lista.size(); i++) 
            {
                listaMaN=listaMaN+listaMayorAMenor.get(i).Marca()+" "+listaMayorAMenor.get(i).getModelo()+" // ";
            }

            
            
            
            
                     
                     
                     
                     
                     
                 
            
            return listaMaN ;
        }

    
    
                
}
