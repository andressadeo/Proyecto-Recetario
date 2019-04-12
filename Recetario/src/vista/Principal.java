package vista;
import controlador.LogicaUsuario;
import controlador.LogicaReceta;
public class Principal {
    private final LogicaReceta logreceta;
    private final Menu menu;
    private final LogicaUsuario logsuario;
    public Principal(){
        this.menu = new Menu(this);
        this.logsuario = new LogicaUsuario();
        this.logreceta = new LogicaReceta();
    }
    public Menu getMenu(){
        return menu;
    }

    public LogicaUsuario getLogica() {
        return logsuario;
    }

    public LogicaReceta getLogreceta() {
        return logreceta;
    }
    
    public static void main (String [] args){
        Principal principal = new Principal();
        principal.getMenu().menuPrincipal();
    }
}
