package empresaSeguridad;

public class Capacitacion implements Asesoria {

	//atributos
	protected int idCapacitacion,
	rutCliente,
	cantAsistentes;
	
	protected String dia,
	hora,
	lugar, 
	duracion;


	//constructor sin parametros
	public Capacitacion() {}

	
	
	//constructor con parametros 
	public Capacitacion(int idCapacitacion, int rutCliente, int cantAsistentes, String dia, String hora, String lugar,
			String duracion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.cantAsistentes = cantAsistentes;
		this.dia = dia;
		this.hora = hora;
		this.lugar = limitarCaracteres(lugar, 10, 50);
		this.duracion = duracion;
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
	
	
	//creamos el metodo, mostrar detalle
	
			public void mostrarDetalle() {
				System.out.println("La capacitacion será en " + this.lugar + " las " 
			+ this.hora + " el dia " + this.dia + " y durará " + this.duracion);
			}


						
			
	@Override
			public String toString() {
				return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente
						+ ", cantAsistentes=" + cantAsistentes + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
						+ ", duracion=" + duracion + ", getIdCapacitacion()=" + getIdCapacitacion()
						+ ", getRutCliente()=" + getRutCliente() + ", getCantAsistentes()=" + getCantAsistentes()
						+ ", getDia()=" + getDia() + ", getHora()=" + getHora() + ", getLugar()=" + getLugar()
						+ ", getDuracion()=" + getDuracion() + ", getClass()=" + getClass() + ", hashCode()="
						+ hashCode() + ", toString()=" + super.toString() + "]";
			}



	//accesadores y mutadores
	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}



	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
