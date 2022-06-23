/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c) {
        super(c);
    }

    public void establecerLista(ArrayList<Docente> listado) {
        lista = listado;
    }

    public void calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public double obtenerPromedio() {
        return promedioSueldos;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Docentes: \n";

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%s. %s\n", cadena, i+1 , lista.get(i));
        }
        
        cadena = String.format("\n%sPromedio de Sueldos: %.2f\n"
                + "Codigo: %s", cadena , promedioSueldos, codigo);
        return cadena;
    }
}
