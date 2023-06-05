package empresaSeguridad;

public class Administrativo extends Usuario{

	//Atributos
	protected String area,
	experienciaPrevia;

	//constructor sin parametros
	public Administrativo() {}
	
	

	//contructor con parametros
	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = limitarCaracteres(area, 5, 20);
		this.experienciaPrevia = limitarCaracteres(experienciaPrevia, 0, 100);
	}
	
	
	//metodo anaizar usuario
	   @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Area Administrativo: " + area);
	        System.out.println("Experencia Administrativo: " + experienciaPrevia);
	    }
	
	 /* creamos metodos para limitar los caracteres de los textos 
	  * que quedaran almacenados en las variables*/

	   private String limitarCaracteres(String texto, int longitudMinima, int longitudMaxima) {
	        if (texto.length() < longitudMinima) {
	            return "";
	        } else if (texto.length() > longitudMaxima) {
	            return texto.substring(0, longitudMaxima);
	        } else {
	            return texto;
	        }
	    }
	
	   
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombreUsuario="
				+ nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", getArea()=" + getArea()
				+ ", getExperienciaPrevia()=" + getExperienciaPrevia() + ", mostrarEdad()=" + mostrarEdad()
				+ ", toString()=" + super.toString() + ", getNombreUsuario()=" + getNombreUsuario()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getrun()=" + getrun() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	//accesadores y mutadores
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	
	
	
	
	
	
}
