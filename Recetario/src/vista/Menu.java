package vista;
import java.util.List;
import java.util.Scanner;
import modelo.Usuario;
import modelo.Recetas;
public class Menu {
    public Principal principal;
    public Scanner escaneo;
    public  Menu(Principal principal){
        this.principal= principal;
        this.escaneo = new Scanner(System.in);
    }
    public void menuPrincipal() {
        int opc= -1;
        do {            
            System.out.println("Bienvenido al Recetario");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            opc= escaneo.nextInt();
            switch (opc){
                case 1:
                    menuIniciarSesion();
                    break;
                case 2:
                    menuRegistrarUsuario();
                    break;
                case 3:
                    opc=0;
                    System.out.println("Que tenag un buuen dia");
                    break;
                default:
                     System.out.println("Opcion no valida");
                break;
            }
            
            
        } while (opc != 0);
    }

    private void menuIniciarSesion() {
        Usuario probar=new Usuario();
        System.out.println("Ingrese Usuario");
        String login=(escaneo.next());
        System.out.println("Ingrese Contraseña");
        String pasw=(escaneo.next());
        //Esta comentado el inicio de sesion por que no se pudo implementar
        /*if(login.equals(probar.getInformacion())==true && pasw.equals(probar.getInformacion())==true){
            menuInterior();
        }*/
        menuInterior();
    }

    private void menuRegistrarUsuario() {
        Usuario cuenta=new Usuario();
        int sg=0;
        do{
            System.out.println("Digite usuario");
            cuenta.setId(escaneo.next());
            System.out.println("Digite la contraseña");
            cuenta.setContraseña(escaneo.next());
            System.out.println("Confirme la contraseña");
            cuenta.setConfcontra(escaneo.next());
            if(cuenta.getContraseña().equals(cuenta.getConfcontra())){
                sg++;
            }else{
                System.out.println("Error en contraseña");
            }
        }while(0==sg);
        if(principal.getLogica().registrarcuenta(cuenta)){
            System.out.println("Usuario Registrado");
        }else{
            System.out.println("Error En el registro");
        }
    }

    private void menuInterior() {
        int opc= -1;
        do{
            System.out.println("Ha logeado con exito");
            System.out.println("1. Agregar una receta");
            System.out.println("2. Eliminar  receta");
            System.out.println("3. Modificar  receta");
            System.out.println("4. Recetas Favoritas");
            System.out.println("5. Buscar  receta");
            System.out.println("6. Devolverme");
            opc= escaneo.nextInt();
            switch(opc){
                case 1:
                    agregarReceta();
                    break;
                case 2:
                    eliminarReceta();
                    break;
                case 3:
                    modificarReceta();
                    break;
                case 4:
                    menuRecetasFavoritas();
                    break;
                case 5:
                    buscarReceta();
                    break;
                case 6:
                    opc=0;
                    System.out.println("Ha salido con Exito");
                    break;
                default:
                    System.err.println("Opcion no valida");
                           
            }
        }while(opc!=0);
    }

    private void agregarReceta() {
        System.out.println("Aun no disponible Agregar receta");
    }

    private void eliminarReceta() {
        System.out.println("Aun no disponible Eliminar receta");
    }

    private void modificarReceta() {
        System.out.println("Aun no disponible Modificar Receta");
    }

    private void menuRecetasFavoritas() {
        System.out.println("Aun no disponible Menu de recetas");
    }

    private void buscarReceta() {
        System.out.println("Aun no disponible Buscar Receta");
    }

    
}
