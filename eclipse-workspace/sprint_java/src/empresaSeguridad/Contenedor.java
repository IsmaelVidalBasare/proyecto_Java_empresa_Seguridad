package empresaSeguridad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.time.LocalDate;

public class Contenedor {
	
	//atributos
	Scanner scanner = new Scanner (System.in);
	
	protected List<Asesoria> clientes;
	protected List<Asesoria> profesionales;
	protected List<Asesoria> administrativos;
	protected List<Asesoria> capacitaciones;
	protected List<Asesoria> usuarios;
	

	//constructor sin parametros
    public Contenedor() {
        clientes = new ArrayList<>();
        profesionales = new ArrayList<>();
        administrativos = new ArrayList<>();
        capacitaciones = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
	
    
	//constructor con parametros
	public Contenedor(Scanner scanner, 
			List<Asesoria> clientes, 
			List<Asesoria> profesionales, 
			List<Asesoria> administrativos, 
			List<Asesoria> capacitaciones,
			List<Asesoria> usuarios){
		super();
		this.scanner = scanner;
		this.clientes = clientes;
		this.profesionales = profesionales;
		this.administrativos = administrativos;
		this.capacitaciones = capacitaciones;
		this.usuarios = usuarios;
	}
	
	
	/* metodos
	 * metodo almacenarCliente()
	 * Ingresamos todos los parametros aunque no todos son obligatorios,
	 * para que todos sean mostrados por pantalla
	 * */
	public void almacenarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        if (nombre == "") {
            do {
                System.out.println("El nombre del cliente no puede ir vacio");
                nombre = scanner.nextLine();
            } while (nombre == "");
        }

        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        if (apellido == "") {
            do {
                System.out.println("El apellido del cliente no puede ir vacio");
                apellido = scanner.nextLine();
            } while (apellido == "");
        }

        System.out.print("Ingrese el APF del cliente: ");
        String apf = scanner.nextLine();

        System.out.print("Ingrese el sistema de salud del cliente: ");
        String sistSalud = scanner.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();
        if (direccion == "") {
            do {
                System.out.println("La dirección del cliente no puede ir vacio");
                direccion = scanner.nextLine();
            } while (direccion == "");
        }

        System.out.print("Ingrese la comuna del cliente: ");
        String comuna = scanner.nextLine();
        if (comuna== "") {
            do {
                System.out.println("La comuna del cliente no puede ir vacio");
                comuna = scanner.nextLine();
            } while (comuna == "");
        }

        System.out.print("Ingrese el RUT del cliente (solo números): ");
        int rut = scanner.nextInt();
        scanner.nextLine(); 
        if (rut == 0) {
            do {
                System.out.println("El RUT del cliente no puede ir vacío");
                rut = scanner.nextInt();
            } while (rut == 0);
        } else {
            if (rut > 99999999) {
                do {
                    System.out.println("Rl RUT del cliente debe ser menor a 99.999.999");
                    rut = scanner.nextInt();
                } while (rut > 99999999);
            }
        }

        System.out.print("Ingrese el teléfono del cliente (sólo números): ");
        int telefono = scanner.nextInt();
        scanner.nextLine(); 
        if (telefono == 0) {
            do {
                System.out.println("El número de Teléfono del cliente no puede ir vacío");
                telefono = scanner.nextInt();
            } while (telefono == 0);
        } else {
            if (telefono > 999999999) {
                do {
                    System.out.println("El número de teléfono debe tener 9 dígitos");
                    telefono = scanner.nextInt();
                } while (telefono > 999999999);
            }
        }

        Cliente cliente = new Cliente(nombre, apellido, apf, sistSalud, direccion, comuna, rut, telefono);
        clientes.add((Asesoria)cliente);

        System.out.println("Cliente almacenado correctamente.");
	}
	
	

	//Método almacenarProfesional
	public void almacenarProfesional() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el titulo del profesional: ");
        String titulo = scanner.nextLine();
        if (titulo == "") {
            do {
                System.out.println("El titulo del profesional no puede ir vacio");
                titulo = scanner.nextLine();
            } while (titulo == "");
        }

        System.out.print("Ingrese fecha de Ingreso del profesional: ");
        String fechaIngreso = scanner.nextLine();
        if (fechaIngreso == "") {
            do {
                System.out.println("La fecha de Ingreso del profesional no puede ir vacia");
                fechaIngreso = scanner.nextLine();
            } while (fechaIngreso == "");
        }
        
        Profesional profesional = new Profesional(titulo, fechaIngreso);
        profesionales.add((Asesoria)profesional);

        System.out.println("Profesional almacenado correctamente.");
	}
	
	
	//metodo AlmacenarAdministrativo()
	 public void almacenarAdministrativo() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el área:");
	        String area = scanner.nextLine();

	        System.out.println("Ingrese la experiencia previa:");
	        String experienciaPrevia = scanner.nextLine();

	        Administrativo administrativo = new Administrativo(area, experienciaPrevia);
	        administrativos.add((Asesoria)administrativo);
	        
	        System.out.println("Administrativo almacenado correctamente.");
	    }
	
	
	public void almacenarCapacitacion() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Ingrese el número identificador de la capacitacion (solo números): ");
	        int idCapacitacion = scanner.nextInt();
	        scanner.nextLine(); 
	        if (idCapacitacion == 0) {
	            do {
	                System.out.println("El identificador de la capacitacion no puede ir vacío");
	                idCapacitacion = scanner.nextInt();
	            } while (idCapacitacion == 0);
	        }
		
	        System.out.print("Ingrese el RUT del cliente empresa (solo números): ");
	        int rutCliente = scanner.nextInt();
	        scanner.nextLine(); 
	        if (rutCliente == 0) {
	            do {
	                System.out.println("El el RUT del cliente empresa no puede ir vacío");
	                rutCliente = scanner.nextInt();
	            } while (rutCliente == 0);
	        } else {
	            if (rutCliente > 99999999) {
	                do {
	                    System.out.println("Rl RUT del cliente empresa debe ser menor a 99.999.999");
	                    rutCliente = scanner.nextInt();
	                } while (rutCliente > 99999999);
	            }
	        }
	        
	        System.out.println("Ingrese el dia (ej. Lunes):");
	        String dia = scanner.nextLine();
	        
	        System.out.println("Ingrese la hora en horas y minutos (Ej. 18:45");
	        String hora = scanner.nextLine();
	        
	        
	        System.out.println("Ingrese la direccion del lugar de la capacitacion:");
	        String lugar = scanner.nextLine();
	        if (lugar == "") {
	            do {
	                System.out.println("La la direccion del lugar no puede ir vacia");
	                lugar = scanner.nextLine();
	            } while (lugar == "");
	        }
	        
	        System.out.println("Ingrese la experiencia previa:");
	        String duracion = scanner.nextLine();
	        
	        System.out.print("Ingrese la cantidad de asistentes a la capacitacion (solo números): ");
	        int cantAsistentes = scanner.nextInt();
	        scanner.nextLine(); 
	        if (cantAsistentes == 0) {
	            do {
	                System.out.println("La cantidad de asistentes a la capacitacion no puede ir vacío");
	                cantAsistentes = scanner.nextInt();
	            } while (cantAsistentes == 0);
	        }
	        
	        Capacitacion capacitacion = new Capacitacion(idCapacitacion, rutCliente, cantAsistentes, dia, hora, lugar, duracion);
	        capacitaciones.add((Asesoria)capacitacion);
	        
	        System.out.println("Capacitacion almacenada correctamente.");
	}
	

	
	
	/* metodo para listar usuarios
	 * antes del metodo listarUsuarios(), creamos un metodo para almacenar usuarios
	 * Luego, creamos el metodo para listar usuarios que serán creados en la clase
	 * Main a modo de ejemplo
	 * */
	
	public void almacenarUsuario(Asesoria usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario almacenado correctamente.");
    }
	
	public void listarUsuarios() {
        for (Asesoria usuario : usuarios) {
        	usuario.analizarUsuario();
        	System.out.println("");
        }
	}
	
	//metodo para eliminar Usuarios segun Rut
	public void eliminarUsuario(int rut) {
		Iterator<Asesoria> iterator = usuarios.iterator();

        while (iterator.hasNext()) {
            Asesoria usuario = iterator.next();

            if (usuario instanceof Usuario) {
                Usuario usuarioActual = (Usuario) usuario;
                if (usuarioActual.getrun() == rut) {
                    iterator.remove();
                    System.out.println("Usuario eliminado correctamente.");
                    return;
                }
            }
        }

        System.out.println("No se encontró un usuario con el RUT especificado.");
    }
	
	/* Para desplegar una lista de los usuarios segun su tipo, crearemos tres metodos
	 * para cada tipo de Usuario:
	 * listarClientes()
	 * listarAdministrativos()
	 * listarProfesionales()
	 * estos, seran invocados desde la clase Main
	 * 
	 * */
	   public void listarClientes() {
	        System.out.println("Lista de clientes: ");

	        for (Asesoria cliente : clientes) {
	            cliente.analizarUsuario();
	            System.out.println();
	        }
	   }
	   
	   //metodo para listar administrativos
	   public void listarAdministrativos() {
	        System.out.println("Lista de administrativos: ");

	        for (Asesoria administrativo : administrativos) {
	            administrativo.analizarUsuario();
	            System.out.println();
	        }
	   }
	   
	   //metodo para listar profesionales
	   public void listarProfesionales() {
	        System.out.println("Lista de profesionales: ");

	        for (Asesoria profesional : profesionales) {
	            profesional.analizarUsuario();
	            System.out.println();
	        }
	   }
	
	   
	   
	   public void listarCapacitaciones() {
	        System.out.println("Lista de capacitaciones:");

	        for (Asesoria capacitacion : capacitaciones) {
	            capacitacion.analizarUsuario();
	            System.out.println();
	        }
	    }
	
		
	//Accesadores y mutadores

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public List<Asesoria> getClientes() {
		return clientes;
	}

	public void setClientes(List<Asesoria> clientes) {
		this.clientes = clientes;
	}

	public List<Asesoria> getProfesionales() {
		return profesionales;
	}

	public void setProfesionales(List<Asesoria> profesionales) {
		this.profesionales = profesionales;
	}

	public List<Asesoria> getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(List<Asesoria> administrativos) {
		this.administrativos = administrativos;
	}

	public List<Asesoria> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Asesoria> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	public List<Asesoria> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Asesoria> usuarios) {
		this.usuarios = usuarios;
	}

	
	
}
