
package modelo;
import java.util.List;

public class Usuario {    
    private String id;
    private String contraseña;
    private String confcontra;
    private List <Usuario> informacion;
    

    public Usuario(String nombres, String contraseña) {
        this.id = nombres;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfcontra() {
        return confcontra;
    }

    public void setConfcontra(String confcontra) {
        this.confcontra = confcontra;
    }



    public List<Usuario> getInformacion() {
        return informacion;
    }

    public void setInformacion(List<Usuario> propiedades) {
        this.informacion = propiedades;
    }
    public String toString() {
        return "Usuario{" + "id=" + id + ", contrase\u00f1a=" + contraseña + ", confcontra=" + confcontra + '}';
    }
    

}
