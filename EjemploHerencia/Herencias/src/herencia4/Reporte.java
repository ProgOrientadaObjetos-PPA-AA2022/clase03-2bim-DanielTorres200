/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;
   
   public Reporte(String c) {
       codigo = c;
   }
   
    public void establecerCodigo(String n){
        codigo = n;
    }
    public String obtenerCodigo(){
        return codigo;
    }
    @Override
    public String toString(){
        String cadena = String.format("Codigo: %s\n", 
                codigo);
        return cadena;
    }
}
