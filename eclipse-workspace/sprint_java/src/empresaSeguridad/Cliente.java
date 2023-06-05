package empresaSeguridad;

import java.time.LocalDate;

public class Cliente extends Usuario{

	//Atributos
	protected String nombre, 
	apellido, 
	apf, 
	sistSalud, 
	direccion, 
	comuna;
	
	protected int rut, 
	telefono;

	//constructor sin parametros
	public Cliente() {}
	
	
	
	//constructor con parametros
	public Cliente(String nombre, String apellido, String apf, String sistSalud, String direccion, String comuna, int rut, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apf = apf;
		this.sistSalud = sistSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.rut = rut;
		this.telefono = telefono;

	}
	
	//constructor desde super clase Usuario
	public Cliente(String nombreUsuario, LocalDate fechaNacimiento, int run) {
		super(nombreUsuario, fechaNacimiento, run);
		// TODO Auto-generated constructor stub
	}


	//Metodo obtenerNombre()
	public void obtenerNombre() {
		System.out.println("Nombre: " + this.nombre + "Apellido: " + this.apellido);
	}
	
	//metodo obtenerSistSalud() que obtiene Sistema de Salud
	public void obtenerSistSalud() {
		System.out.println("El sistema de salud es: " + this.sistSalud);
	}
	
	//metodo analiizar usuario
	   @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Comuna: " + comuna);
	    }
	
	
	   
	//
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", apf=" + apf + ", sistSalud=" + sistSalud
				+ ", direccion=" + direccion + ", comuna=" + comuna + ", RUT=" + rut + ", telefono=" + telefono
				+ ", nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getApf()=" + getApf()
				+ ", getSistSalud()=" + getSistSalud() + ", getDireccion()=" + getDireccion() + ", getComuna()="
				+ getComuna() + ", getRUT()=" + getRUT() + ", getTelefono()=" + getTelefono() + ", mostrarEdad()="
				+ mostrarEdad() + ", getNombreUsuario()=" + getNombreUsuario() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getrun()=" + getrun() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	//accesadores y mutadores 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApf() {
		return apf;
	}
	public void setApf(String apf) {
		this.apf = apf;
	}
	public String getSistSalud() {
		return sistSalud;
	}
	public void setSistSalud(String sistSalud) {
		this.sistSalud = sistSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getRUT() {
		return rut;
	}
	public void setRUT(int rut) {
		this.rut = rut;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	

	
	
	
	
	
	
	
}
