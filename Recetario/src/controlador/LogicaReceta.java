/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Recetas;

public class LogicaReceta {
    private List<Recetas> receta;

    public LogicaReceta(){
        this.receta= new ArrayList<>();
    }
    
    /* Agregar Persona
    
    */
    public boolean registrareceta(Recetas carta) {
        for (int i = 0; i < receta.size(); i++) {
            if (receta.get(i).getNombrereceta().equals(carta.getNombrereceta())){
                return false;
            }
        }
        receta.add(carta);
        return true;
    }

    public List<Recetas> listaPersonas() {
        return receta;
    }
}
