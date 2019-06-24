/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Collection;
import javax.sound.midi.Soundbank;


/**
 *
 * @author lucas
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Local local1= new Local();
        Auto auto1=new Auto("Peugeot", "206",4,200000.00);
        Moto moto1=new Moto("Honda", "Titan","125c",60000.00);
        Auto auto2=new Auto("Peugeot", "208", 5, 250000.00);
        Moto moto2=new Moto("Yamaha", "YBR", "160c", 80500.50);
        local1.agregarLista(auto1);
        local1.agregarLista(moto1);
        local1.agregarLista(auto2);
        local1.agregarLista(moto2);
        
        //MOSTRAR LISTA
        System.out.println(local1.mostrarLista());        
        
        System.out.println("============================="); 
        System.out.println("Vehículo más caro: "+local1.vehiculoMasCaro());
        System.out.println("Vehículo más barato:"+local1.vehiculoMasBarato());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+local1.VehiculoConY());
        System.out.println("=============================");
        System.out.println("vehiculos ordenados por en mayor a menor: ");
        System.out.println(local1.mayorAMenor());
    }
    
}
