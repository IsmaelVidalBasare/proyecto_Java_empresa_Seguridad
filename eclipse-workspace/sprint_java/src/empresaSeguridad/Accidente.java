package empresaSeguridad;

public class Accidente {

	//Atributos
	protected String idAccidente,
	diaAccidente,
	lugar,
	oringen,
	consecuencias;
	
	protected int rutAccidentado,
	hora;

	//contrcutor sin parametros
	public Accidente() {}
	
	//constructo con parametros
	public Accidente(String idAccidente, String diaAccidente, String lugar, String oringen, String consecuencias,
			int rutAccidentado, int hora) {
		super();
		this.idAccidente = idAccidente;
		this.diaAccidente = diaAccidente;
		this.lugar = lugar;
		this.oringen = oringen;
		this.consecuencias = consecuencias;
		this.rutAccidentado = rutAccidentado;
		this.hora = hora;
	}

	
	
	//accesadores y mutadores 
	public String getId_accidente() {
		return idAccidente;
	}
	public void setId_accidente(String id_accidente) {
		this.idAccidente = id_accidente;
	}
	public String getDiaAccidente() {
		return diaAccidente;
	}
	public void setDiaAccidente(String diaAccidente) {
		this.diaAccidente = diaAccidente;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getOringen() {
		return oringen;
	}
	public void setOringen(String oringen) {
		this.oringen = oringen;
	}
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	public int getRutAccidentado() {
		return rutAccidentado;
	}
	public void setRutAccidentado(int rutAccidentado) {
		this.rutAccidentado = rutAccidentado;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	

	
	
	
	
	
	
	
}
