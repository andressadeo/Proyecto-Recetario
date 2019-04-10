package vista;

import javax.swing.JFrame;
import java.util.Scanner;
public class Principal {
	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//No BORRAR ESTOS METODOS, SON PARA LA EJECUCION DE LA VISTA, SOLO COMENTAR 
		/*Crea un Objeto de tipo InterfazGrafica que se va a encargar de mostrar el registro de la aplicación*/
		InterfazGrafica interfazRegistro = new InterfazGrafica(); 	
		interfazRegistro.setVisible(true);
		interfazRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*La clase de Jframe extiende de windows y tiene sus propios metodos*/  /*Exit ON CLOSE se refiere a cerrar al salir*/
		int opcion=0;
        	int seguir=0;
       		String id,cont,conf;
        	Menu opcions = new Menu(opcion);
        	do{
            		System.out.println("Bienvenido a recetario\n1. registrarse\n2. Ingresar");
            		opcion=leer.nextInt();
            		switch(opcion){
               			case 1:
                    			System.out.println("Ingrese un usuario");
                    			id=leer.next();
                    			System.out.println("ingrese contraseña");
                    			cont=leer.next();
                    			System.out.println("Confirme contraseña");
                    			conf=leer.next();
                    			opcions.registrarse(id, cont, conf);
                    			break;
               	 		case 2:
                    			do{
                        			System.out.println("Ingrese un usuario");
                        			id=leer.next();
                        			System.out.println("ingrese contraseña");
                        			cont=leer.next();
                        			boolean confirm= opcions.iniciarsesion(id, cont);
                        			if(confirm==true){
                        			    	System.out.println("bienvenido");
                        				seguir++;
                         				opcions.menuinterior();
                        			}else{
                            				System.out.println("Datos erroneos intente nuevamente");
                        			}
                    			}while(seguir==0);
                    			break;
                		default:
                    			System.err.println("Opcion no valida intente nuevamente");
                    			break;
            			}
            			System.out.println("Desea hacer otra opcion ingrese '0', de lo contrario cualquier otro numero");
            			seguir=leer.nextInt();
        		}while(seguir==0);

	}

}
