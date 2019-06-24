/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author lucas
 */
import java.util.Comparator;
public class MayorMenor implements Comparator<Vehiculo>{

    @Override
    public int compare(Vehiculo t, Vehiculo t1) {
        if(t.getPrecio()> t1.getPrecio())return -1 ;
        if(t.getPrecio()< t1.getPrecio())return 1 ;
        return 0;
    }
    
}
