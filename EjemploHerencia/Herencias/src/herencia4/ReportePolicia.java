/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String c) {
        super(c);
    }
    
    public void establecerLista(ArrayList<Policia> listado) {
        lista = listado;
    }

    public void calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public double obtenerPromedio() {
        return promedioEdades;
    }

    @Override
    public String toString(){
        String cadena = "Lista de Policias: \n";
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        
        cadena = String.format("\n%sPromedio de Edadess: %.2f\n"
                + "Codigo: %s", cadena , promedioEdades, codigo);
        
        return cadena;
    }
}
