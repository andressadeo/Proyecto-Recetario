package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
public class LogicaUsuario {
    private List<Usuario> usuario;
    public LogicaUsuario(){
        this.usuario= new ArrayList<>();
    }        
    public boolean registrarcuenta(Usuario cuenta) {
        for (int i = 0; i < usuario.size(); i++) {
            if (usuario.get(i).getId().equals(cuenta.getId())){
                return false;
            }
        }
        usuario.add(cuenta);
        return true;
    }

    public List<Usuario> listaPersonas() {
        return usuario;
    }
}
