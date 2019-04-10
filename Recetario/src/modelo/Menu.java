
package modelo;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    int seguir=0;
    protected String id;
    protected String contraseña;
    private String confcontras;
    public Menu(int numero){        
    }
    public Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void registrarse(String usu,String contra,String confir){
        id=usu;
        contraseña=contra;
        confcontras=confir;
        do{
            if(contraseña.equals(confcontras)==true){
                System.out.println("Usuario registrado");
                seguir++;
            }else{
                System.err.println("Contraseñas no coinciden");
                System.out.println("Ingrese Contraseña");
                contraseña=sc.next();
                System.out.println("Confirme Contraseña");
                confcontras=sc.next();
            }
        }while(seguir==0);
    }
    public boolean iniciarsesion(String ids,String cont){
        boolean confirmar;
        if(cont.equals(contraseña)==true && id.equals(ids)==true){
            confirmar=true;
        }else{
            confirmar=false;
        }
        return confirmar;
    }
    public void menuinterior(){
        do{
            Recetas opci=new Recetas();
            System.out.println("Menu principal\n1. Crear Receta\n2. Modificar receta\n3. Favoritos\n4. Mis Recetas");
            seguir=sc.nextInt();
            switch(seguir){
                case 1:
                    opci.Crear();
                    break;
                case 2:
                    opci.Editar();
                    break;
                case 3:
                    opci.favoritos();
                    break;
                case 4:
                    opci.misrecetas();
                    break;
                default:
                    seguir=9;
                    System.out.println("Dato invalido");
                    break;
            }        
        }while(seguir==9);
    }
}
