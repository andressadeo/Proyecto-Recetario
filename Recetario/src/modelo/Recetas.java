package modelo;
import java.util.List;
public class Recetas {
    private String nombrereceta;
    private String ingredientes;
    private List <Recetas> clases;

    public Recetas() {
    }

    public Recetas(String nombrereceta, String ingredientes) {
        this.nombrereceta = nombrereceta;
        this.ingredientes = ingredientes;
    }

    public String getNombrereceta() {
        return nombrereceta;
    }

    public void setNombrereceta(String nombrereceta) {
        this.nombrereceta = nombrereceta;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String toString() {
        return "Recetas{" + "nombrereceta=" + nombrereceta + ", ingredientes=" + ingredientes + '}';
    }
    
}
