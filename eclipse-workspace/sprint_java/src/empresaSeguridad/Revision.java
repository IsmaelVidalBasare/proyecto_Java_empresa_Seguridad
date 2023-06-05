package empresaSeguridad;

public class Revision extends VisitaTerreno{

	protected int idRevision,
	estado;
	protected String nombreRevision,
	detalleRevision;
	
	
	
	//constructor sin parametros
	
	//construtor con parametros
	public Revision(int idRevision, int estado, String nombreRevision, String detalleRevision) {
		super();
		this.idRevision = idRevision;
		this.estado = estado;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
	}
	
	
	
}
