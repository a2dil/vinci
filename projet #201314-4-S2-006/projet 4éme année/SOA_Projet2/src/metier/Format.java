package metier;

public class Format {

	private int id_format;
	private String nom_format;
	
	
	
	public int getId_format() {
		return id_format;
	}
	public void setId_format(int id_format) {
		this.id_format = id_format;
	}
	public String getNom_format() {
		return nom_format;
	}
	public void setNom_format(String nom_format) {
		this.nom_format = nom_format;
	}
	@Override
	public String toString() {
		return "Format [id_format=" + id_format + ", nom_format=" + nom_format
				+ "]";
	}
	
	
	public Format(String nom_format) {
		super();
		this.nom_format = nom_format;
	}
	public Format() {
		super();
		
	}
	
	
}
