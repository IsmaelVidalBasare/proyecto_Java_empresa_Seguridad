package empresaSeguridad;
import java.util.Scanner;
import java.time.LocalDate;

public class MainSeguridad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		//creamos objetos
		 Contenedor contenedor = new Contenedor();
		 
		
		 // Crear algunos usuarios de ejemplo
	        Usuario usuario1 = new Usuario("Usuario1", LocalDate.of(1990, 1, 1), 12345678);
	        Usuario usuario2 = new Usuario("Usuario2", LocalDate.of(1995, 2, 15), 87654321);
	        Usuario usuario3 = new Usuario("Usuario3", LocalDate.of(1998, 5, 20), 12366523);
	        Usuario usuario4 = new Usuario("Usuario4", LocalDate.of(1999, 9, 10), 145214583);

	    // Almacenamos los usuarios en el contenedor
	        contenedor.almacenarUsuario(usuario1);
	        contenedor.almacenarUsuario(usuario2);
	        contenedor.almacenarUsuario(usuario3);
	        contenedor.almacenarUsuario(usuario4);
	        
	        int opcion;
	        do {
	       
			System.out.println("Ingrese una opcion a realizar");
			System.out.println("Ingrese 1 para agregar un cliente");
			System.out.println("Ingrese 2 para agregar un profesional");
			System.out.println("Ingrese 3 para agregar un administrativo");
			System.out.println("Ingrese 4 para agregar una capacitacion");
			System.out.println("Ingrese 5 para eliminar un usuario");
			System.out.println("Ingrese 6 para mostrar una lista de usuarios");
			System.out.println("Ingrese 7 para mostrar una lista de usuarios por tipo");
			System.out.println("Ingrese 8 para mostrar una lista de capacitaciones");
			System.out.println("Ingrese 9 para salir");
			
			opcion = scanner.nextInt(); 
		
		/* creamos un switch para acceder a los metodos de las clases
		 * segun la opcion que marque el operador del sistema
		 *  */
		switch (opcion) {
	      case 1:
	    	  contenedor.almacenarCliente();
	        break;
	      case 2:
	    	  contenedor.almacenarProfesional();
	        break;
	      case 3:
	        contenedor.almacenarAdministrativo();
	        break;
	      case 4:
	    	contenedor.almacenarCapacitacion();
	        break;
	      case 5:
	    	  // Eliminamos un usuario por su RUT
	    	    int rutEliminar = 12345678;
	    	    contenedor.eliminarUsuario(rutEliminar);

	    	    // Listar los usuarios después de eliminar
	    	    contenedor.listarUsuarios();
	        break;
	      case 6:
	    	  contenedor.listarUsuarios();
	        break;
	      case 7:
	    	  System.out.println("Ingrese uno de los tipos de usuario para despelgar listado: "
	    		+ "Ingrese 1 para listado Clientes"
	    		+ "Ingrese 2 para listado Administrativos"
	    		+ "Ingrese 3 para listado Profesional");
	    	  int opcion7 = scanner.nextInt(); 
	    	  switch (opcion7) {
	    	  case 1:
	    		  contenedor.listarClientes();
	    	 	break;
	    	  case 2:
	    		  contenedor.listarAdministrativos();
	    		  break;
	    	  case 3:
	    		  contenedor.listarProfesionales();
	    	  }
	        break;
	      case 8:
		        contenedor.listarCapacitaciones();
		        break;
	      case 9:
              System.out.println("Saliendo del programa...");
              break;
          default:
              System.out.println("Opción inválida. Intente nuevamente.");
              break;
     	}
	  } while (opcion != 9);
		
	}

}
