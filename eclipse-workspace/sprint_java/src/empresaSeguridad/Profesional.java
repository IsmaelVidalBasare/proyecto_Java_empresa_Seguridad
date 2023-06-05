package empresaSeguridad;

public class Profesional extends Usuario {

	//atributos
	protected String titulo,
	fechaIngreso;

	
	
	//conostructos sin parametros
	public Profesional() {}
	
	//constructor con parametros
	public Profesional(String titulo, String fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	
	
	//metodo anaizar usuario
	   @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Titulo Profesional: " + titulo);
	        System.out.println("Fecha Ingreso: " + fechaIngreso);
	    }

	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", nombreUsuario=" + nombreUsuario
				+ ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", getTitulo()=" + getTitulo()
				+ ", getFechaIngreso()=" + getFechaIngreso() + ", mostrarEdad()=" + mostrarEdad() + ", toString()="
				+ super.toString() + ", getNombreUsuario()=" + getNombreUsuario() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getrun()=" + getrun() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	//accesadores y mutadores
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
	
	
	
}
