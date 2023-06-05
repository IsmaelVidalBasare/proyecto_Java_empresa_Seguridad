package empresaSeguridad;


public class VisitaTerreno extends Accidente {

	//Atributps
	protected String diaAccidente,
	horaAccidente,
	lugarAccidente,
	comentarios;
	
	
	protected int idVisita;
	
	//constructor sin parametros
	public VisitaTerreno() {}

	//constructor con parametros 
	public VisitaTerreno(String diaAccidente, String horaAccidente, String lugarAccidente, String comentarios,
			int idVisita) {
		super();
		this.diaAccidente = diaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.comentarios = comentarios;
		this.idVisita = idVisita;
	}
	


	
	
	
}
