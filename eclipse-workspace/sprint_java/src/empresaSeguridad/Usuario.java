package empresaSeguridad;
import java.time.LocalDate;
import java.time.Period;

public class Usuario implements Asesoria{

	//atributos
	protected String nombreUsuario;
	protected LocalDate fechaNacimiento;
	protected int run;
	
	//constructor sin parametros
	public Usuario() {}

	//constructor con parametros
	public Usuario(String nombreUsuario, LocalDate fechaNacimiento, int run) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	
	/* metodo mostrar edad:
	 * antes del metodo mostrar edad debemos crear el metodo
	 * para calcular la edad. calcularEdad();
	 * 
	 * */
	
	    // Método mostrarEdad
	    public String mostrarEdad() {
	        int edad = calcularEdadActual();
	        return "El usuario tiene " + edad + " años";
	    }
	
	    // Método calcularEdadActual
	    private int calcularEdadActual() {
	        LocalDate fechaActual = LocalDate.now();
	        Period periodo = Period.between(fechaNacimiento, fechaActual);
	        return periodo.getYears();
	    }
	
	    // Método analizarUsuario
		@Override
		public void analizarUsuario() {
			// TODO Auto-generated method stub
			  System.out.println("Nombre: " + nombreUsuario);
		      System.out.println("RUN: " + run);
		}
	
		
		@Override
		public String toString() {
			return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
					+ ", mostrarEdad()=" + mostrarEdad() + ", calcularEdadActual()=" + calcularEdadActual()
					+ ", getNombreUsuario()=" + getNombreUsuario() + ", getFechaNacimiento()=" + getFechaNacimiento()
					+ ", getrun()=" + getrun() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		

	
	//accesadore y mutadores 
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getrun() {
		return run;
	}
	public void setrun(int run) {
		this.run = run;
	}




	
	
	
	
	
}
